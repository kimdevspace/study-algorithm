from collections import deque
m,n=map(int,input().split())
box=[list(map(int,input().split())) for _ in range(n)]

q=deque([])

for i in range(n):
    for j in range(m):
        if box[i][j]==1:
            q.append((i,j))
dx=[-1,1,0,0]
dy=[0,0,-1,1]

while q:
    x,y=q.popleft()
    for i in range(4):
        nx=x+dx[i]
        ny=y+dy[i]
        if 0<=nx<n and 0<=ny<m and box[nx][ny]==0:
            q.append((nx,ny))
            box[nx][ny]=box[x][y]+1

day=0
for i in box:
    for j in i:
        if j==0:
            print(-1)
            exit(0)
        day=max(day,j)
print(day-1)