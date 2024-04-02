from collections import deque
n=int(input())
arr=[list(map(int,input().split())) for _ in range(n)]
#최댓값 찾기 (반복횟수)
MAX=0
for i in range(n):
    for j in range(n):
        MAX=max(MAX,arr[i][j])

dx=[0,0,-1,1]
dy=[-1,1,0,0]

def bfs(x,y,r):
    q=deque([(x,y)])
    visited[x][y]=1
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx=x+dx[i]
            ny=y+dy[i]
            if 0<=nx<n and 0<=ny<n and visited[nx][ny]==0 and arr[nx][ny]>r:
                visited[nx][ny]=1
                q.append((nx,ny))
res=0
for i in range(MAX):
    visited=[[0]*(n+1) for _ in range(n+1)]
    cnt=0
    for j in range(n):
        for k in range(n):
            if arr[j][k]>i and visited[j][k]==0:
                bfs(j,k,i)
                cnt+=1
    res=max(res,cnt)
print(res)