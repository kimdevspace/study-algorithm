from collections import deque
m,n,h=map(int,input().split())
box=[[list(map(int,input().split())) for _ in range(n)] for _ in range(h)]

q=deque([])

for i in range(h):
    for j in range(n):
        for k in range(m):
            if box[i][j][k]==1:
                q.append([i,j,k])

dx=[-1,1,0,0,0,0]
dy=[0,0,-1,1,0,0]
dz=[0,0,0,0,-1,1]

while q:
    z,x,y=q.popleft()
    for i in range(6):
        nz=z+dz[i]
        nx=x+dx[i]
        ny=y+dy[i]
        if 0<=nx<n and 0<=ny<m and 0<=nz<h and box[nz][nx][ny]==0:
            q.append([nz,nx,ny])
            box[nz][nx][ny]=box[z][x][y]+1
day=0
for i in box:
    for j in i:
        for k in j:
            if k==0:
                print(-1)
                exit(0)
        day=max(day,max(j))
print(day-1)