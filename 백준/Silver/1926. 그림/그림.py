from collections import deque
n,m=map(int,input().split())
graph=[list(map(int,input().split())) for _ in range(n)]

dx=[0,0,-1,1]
dy=[-1,1,0,0]
ans=[]

def bfs(x,y):
    q=deque([(x,y)])
    graph[x][y]=0
    cnt=1
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<m and graph[nx][ny]==1:
                q.append((nx,ny))
                graph[nx][ny]=0
                cnt+=1
    return cnt

for i in range(n):
    for j in range(m):
        if graph[i][j]==1:
            ans.append(bfs(i,j))

if len(ans)==0:
    print(0)
    print(0)
else:
    print(len(ans))
    print(max(ans))