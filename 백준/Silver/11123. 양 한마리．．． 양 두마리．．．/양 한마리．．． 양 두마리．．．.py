from collections import deque

dx=[-1,1,0,0]
dy=[0,0,-1,1]

def bfs(x,y):
    q=deque([(x,y)])
    graph[x][y]='.'
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<h and 0<=ny<w and graph[nx][ny]=='#':
                q.append((nx,ny))
                graph[nx][ny]='.'

t=int(input())
for _ in range(t):
    cnt=0
    h,w=map(int,input().split())
    graph=[list(input()) for _ in range(h)]
    for i in range(h):
        for j in range(w):
            if graph[i][j]=='#':
                bfs(i,j)
                cnt+=1
    print(cnt)