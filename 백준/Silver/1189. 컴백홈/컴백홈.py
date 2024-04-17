import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
r,c,k=map(int,input().split())
graph=[list(input()) for _ in range(r)]
dx=[-1,1,0,0]
dy=[0,0,-1,1]
ans=0
def dfs(x,y,d):
    global ans
    if x==0 and y==c-1 and d==k:
        ans+=1
    graph[x][y]='T'
    for i in range(4):
        nx,ny=x+dx[i],y+dy[i]
        if 0<=nx<r and 0<=ny<c and graph[nx][ny]=='.':
            graph[nx][ny]='T'
            dfs(nx,ny,d+1)
            graph[nx][ny]='.'
dfs(r-1,0,1)
print(ans)