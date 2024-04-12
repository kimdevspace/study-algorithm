from collections import deque
m,n=map(int,input().split())
dx=[-1,-1,-1,0,0,1,1,1]
dy=[-1,0,1,-1,1,-1,0,1]
graph=[list(map(int,input().split())) for _ in range(m)]
cnt=0
def bfs(x,y):
    q=deque([(x,y)])
    graph[x][y]=0
    while q:
        x,y=q.popleft()
        for i in range(8):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<m and 0<=ny<n and graph[nx][ny]==1:
                graph[nx][ny]=0
                q.append((nx,ny))
for i in range(m):
    for j in range(n):
        if graph[i][j]==1:
            bfs(i,j)
            cnt+=1
print(cnt)