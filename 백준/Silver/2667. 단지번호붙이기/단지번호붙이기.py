from collections import deque
N=int(input())
home=[list(map(int,input())) for _ in range(N)]

dx=[0,0,-1,1]
dy=[-1,1,0,0]

ans=[] #오름차순으로 단지의 집 개수를 담을 배열

def bfs(x,y):
    q=deque([(x,y)])
    home[x][y]=0
    cnt=1
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<N and 0<=ny<N and home[nx][ny]==1:
                q.append((nx,ny))
                home[nx][ny]=0
                cnt+=1
    return cnt

for i in range(N):
    for j in range(N):
        if home[i][j]==1:
            ans.append(bfs(i,j))

print(len(ans))
ans.sort()
for a in ans:
    print(a)