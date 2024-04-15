from collections import deque
dx=[-2,-2,0,0,2,2]
dy=[-1,1,-2,2,-1,1]
n=int(input())
graph=[[0]*n for _ in range(n)]
r1,c1,r2,c2=map(int,input().split())
def bfs(r1,c1):
    q=deque([(r1,c1)])
    while q:
        x,y=q.popleft()
        for i in range(6):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<n and 0<=ny<n and not graph[nx][ny]:
                graph[nx][ny]=graph[x][y]+1
                q.append((nx,ny))
bfs(r1,c1)
if graph[r2][c2]==0:
    print(-1)
else:
    print(graph[r2][c2])