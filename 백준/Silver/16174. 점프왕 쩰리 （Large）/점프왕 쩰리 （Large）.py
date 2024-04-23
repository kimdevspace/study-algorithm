import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n=int(input())
graph=[list(map(int,input().split())) for _ in range(n)]
visited=[[False]*n for _ in range(n)]
dx=[0,1]
dy=[1,0]
def dfs(x,y):
    visited[x][y]=True
    for i in range(2):
        nx,ny=x+dx[i]*graph[x][y],y+dy[i]*graph[x][y]
        if 0<=nx<n and 0<=ny<n and not visited[nx][ny]:
            if graph[nx][ny]==-1:
                print('HaruHaru')
                exit(0)
            else:
                dfs(nx,ny)
if not dfs(0,0):
    print('Hing')