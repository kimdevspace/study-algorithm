#dfs
N=int(input())
arr=[list(map(int,input().split())) for _ in range(N)]
visited=[[0]*N for _ in range(N)]
def dfs(x,y):
    #범위가 음수이거나 N-1 이상이면 return
    if x<=-1 or x>=N or y<=-1 or y>=N or visited[x][y]==1: 
        return
    #-1에 도달 시 방문처리 후 return
    if arr[x][y]==-1:
        visited[x][y]=1
        return
    visited[x][y]=1
    dfs(x+arr[x][y],y)
    dfs(x,y+arr[x][y])
dfs(0,0)
if visited[-1][-1]==1:
    print('HaruHaru')
else:
    print('Hing')