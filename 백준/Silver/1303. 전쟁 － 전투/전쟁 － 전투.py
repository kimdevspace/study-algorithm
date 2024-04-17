import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n,m=map(int,input().split())
graph=[list(input()) for _ in range(m)]
visited=[[False]*n for _ in range(m)]
ans=[0,0]
dx=[-1,1,0,0]
dy=[0,0,-1,1]

def dfs(x,y):
    visited[x][y]=True
    cnt=1
    for i in range(4):
        nx,ny=x+dx[i],y+dy[i]
        if 0<=nx<m and 0<=ny<n and not visited[nx][ny] and graph[x][y]==graph[nx][ny]:
            cnt+=dfs(nx,ny)
    return cnt

for i in range(m):
    for j in range(n):
        if graph[i][j]=='W' and not visited[i][j]:
            ans[0]+=dfs(i,j)**2
        elif graph[i][j]=='B' and not visited[i][j]:
            ans[1]+=dfs(i,j)**2
print(*ans)