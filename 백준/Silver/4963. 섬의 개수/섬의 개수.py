import sys
sys.setrecursionlimit(10000)
dx=[-1,-1,-1,0,0,1,1,1]
dy=[-1,0,1,-1,1,-1,0,1]
def dfs(x,y):
    visited[x][y]=1
    if arr[x][y]==1:
        for i in range(8):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<h and 0<=ny<w and arr[nx][ny]==1 and not visited[nx][ny]:
                dfs(nx,ny)
while True:
    cnt=0
    w,h=map(int,input().split())
    if w==0 and h==0:
        break
    visited=[[0]*w for _ in range(h)]
    arr=[list(map(int,input().split())) for _ in range(h)]
    for i in range(h):
        for j in range(w):
            if arr[i][j]==1 and not visited[i][j]:
                dfs(i,j)
                cnt+=1
    print(cnt)