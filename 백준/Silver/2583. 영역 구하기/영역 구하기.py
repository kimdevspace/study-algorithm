from collections import deque
m,n,k=map(int,input().split())
graph=[[0]*n for _ in range(m)]
for _ in range(k):
    x1,y1,x2,y2=map(int,input().split())
    for i in range(x1,x2):
        for j in range(m-y1-1,m-y2-1,-1):
            graph[j][i]=1
ans=[]
dx=[-1,1,0,0]
dy=[0,0,-1,1]
def bfs(x,y):
    q=deque([(x,y)])
    graph[x][y]=1
    cnt=1
    while q:
        x,y=q.popleft()
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]
            if 0<=nx<m and 0<=ny<n and graph[nx][ny]==0:
                q.append((nx,ny))
                graph[nx][ny]=1
                cnt+=1
    return cnt
for i in range(m):
    for j in range(n):
        if graph[i][j]==0:
            ans.append(bfs(i,j))
ans.sort()
print(len(ans))
print(*ans)