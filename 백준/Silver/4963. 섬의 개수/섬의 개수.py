from collections import deque
dx=[-1,-1,-1,0,0,1,1,1]
dy=[-1,0,1,-1,1,-1,0,1]
def bfs(x,y):
    q=deque([(x,y)])
    arr[x][y]=0
    while q:
        x,y=q.popleft()
        for i in range(8):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<h and 0<=ny<w and arr[nx][ny]==1:
                arr[nx][ny]=0
                q.append((nx,ny))
while True:
    cnt=0
    w,h=map(int,input().split())
    if w==0 and h==0:
        break
    arr=[list(map(int,input().split())) for _ in range(h)]
    for i in range(h):
        for j in range(w):
            if arr[i][j]==1:
                bfs(i,j)
                cnt+=1
    print(cnt)