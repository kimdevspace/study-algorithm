from collections import deque
m,n=map(int,input().split())
graph=[list(input()) for _ in range(m)]

dx=[-1,1,0,0]
dy=[0,0,-1,1]

flag=0
def bfs(x,y):
    global flag
    q=deque([(x,y)])
    while q:
        x,y=q.popleft()
        if x==m-1:
            flag=1
            return
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<m and 0<=ny<n and graph[nx][ny]=='0':
                graph[nx][ny]='1'
                q.append((nx,ny))

for i in range(n):
    if graph[0][i]=='0':
        bfs(0,i)
if not flag:
    print('NO')
else:
    print('YES')