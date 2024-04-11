from collections import deque
r,c=map(int,input().split())
graph=[list(input()) for _ in range(r)]
dx=[-1,1,0,0]
dy=[0,0,-1,1]


def bfs(x,y):
    sheep=0
    wolf=0
    q=deque([(x,y)])
    if graph[x][y]=='o':
        sheep+=1
    elif graph[x][y]=='v':
        wolf+=1
    graph[x][y]='#'
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<r and 0<=ny<c and graph[nx][ny]!='#':
                if graph[nx][ny]=='o':
                    sheep+=1
                elif graph[nx][ny]=='v':
                    wolf+=1
                q.append((nx,ny))
                graph[nx][ny]='#'
    if sheep>wolf:
        return sheep,0
    elif wolf>=sheep:
        return 0,wolf

s,w=0,0                
for i in range(r):
    for j in range(c):
        if graph[i][j] in 'ov':
            ts,tw=bfs(i,j)
            s+=ts
            w+=tw
print(s,w)