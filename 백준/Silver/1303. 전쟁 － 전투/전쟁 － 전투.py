from collections import deque
n,m=map(int,input().split())
graph=[list(input()) for _ in range(m)]
visited=[[False]*n for _ in range(m)]
ans=[0,0]
dx=[-1,1,0,0]
dy=[0,0,-1,1]

def bfs(x,y):
    cnt=0
    q=deque([(x,y)])
    visited[x][y]=True
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<m and 0<=ny<n and not visited[nx][ny] and graph[x][y]==graph[nx][ny]:
                q.append((nx,ny))
                visited[nx][ny]=True
                cnt+=1
    return cnt+1
for i in range(m):
    for j in range(n):
        if graph[i][j]=='W' and not visited[i][j]:
            ans[0]+=bfs(i,j)**2
        elif graph[i][j]=='B' and not visited[i][j]:
            ans[1]+=bfs(i,j)**2
print(*ans)