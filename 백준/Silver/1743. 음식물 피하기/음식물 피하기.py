import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n,m,k=map(int,input().split())
graph=[[0]*m for _ in range(n)]
visited=[[False]*m for _ in range(n)]
for i in range(k):
    x,y=map(int,input().split())
    graph[x-1][y-1]=1
res=0
dx=[-1,1,0,0]
dy=[0,0,-1,1]
def dfs(x,y):
    global cnt
    for i in range(4):
        nx=x+dx[i]
        ny=y+dy[i]
        if 0<=nx<n and 0<=ny<m and graph[nx][ny]==1 and not visited[nx][ny]:
            visited[nx][ny]=True
            cnt+=1
            dfs(nx,ny)
for i in range(n):
    for j in range(m):
        if graph[i][j]==1 and not visited[i][j]:
            cnt=0
            dfs(i,j)
            res=max(res,cnt)
print(res)