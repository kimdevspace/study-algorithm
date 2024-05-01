from collections import deque
n,m=map(int,input().split())
r,c,d=map(int,input().split())
arr=[list(map(int,input().split())) for _ in range(n)]
visited=[[0]*m for _ in range(n)]
cnt=0
#0,1,2,3 <==> 북,동,남,서 순서. 반시계 90도 방향전환은 (d+3)%4
dx=[-1,0,1,0]
dy=[0,1,0,-1]

def bfs(x,y,d):
    global cnt
    q=deque([(x,y)])
    visited[x][y]=1
    cnt+=1
    while q:
        x,y=q.popleft()
        flag=0
        for _ in range(4):
            d=(d+3)%4
            nx,ny=x+dx[d],y+dy[d]
            if 0<=nx<n and 0<=ny<m and not arr[nx][ny]:
                if not visited[nx][ny]:
                    visited[nx][ny]=1
                    q.append((nx,ny))
                    cnt+=1
                    flag+=1
                    break
        if flag==0:
            if arr[x-dx[d]][y-dy[d]] != 1:
                q.append((x-dx[d],y-dy[d]))
            else:
                print(cnt)
                break
bfs(r,c,d)