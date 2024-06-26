import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline

dx=[-1,1,0,0]
dy=[0,0,-1,1]

def dfs(x,y):
    graph[x][y]='.'
    for i in range(4):
        nx,ny=x+dx[i],y+dy[i]
        if 0<=nx<h and 0<=ny<w and graph[nx][ny]=='#':
            dfs(nx,ny)

t=int(input())
for _ in range(t):
    cnt=0
    h,w=map(int,input().split())
    graph=[list(input()) for _ in range(h)]
    for i in range(h):
        for j in range(w):
            if graph[i][j]=='#':
                dfs(i,j)
                cnt+=1
    print(cnt)