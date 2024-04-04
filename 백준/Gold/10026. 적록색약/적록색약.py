from collections import deque
n=int(input())
color=[list(input()) for _ in range(n)]
visited=[[0]*n for _ in range(n)]
dx=[-1,1,0,0]
dy=[0,0,-1,1]
ans=[0,0]
def bfs(x,y):
    q=deque([(x,y)])
    visited[x][y]=1
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<n and 0<=ny<n and color[x][y]==color[nx][ny] and not visited[nx][ny]:
                visited[nx][ny]=1
                q.append((nx,ny))
#정상
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i,j)
            ans[0]+=1
#적록색맹
for i in range(n):
    for j in range(n):
        if color[i][j]=='R':
            color[i][j]='G'
visited=[[0]*n for _ in range(n)]
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i,j)
            ans[1]+=1
print(*ans)