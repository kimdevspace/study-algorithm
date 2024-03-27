from collections import deque
n,m=map(int,input().split())
graph=[list(map(int,input().rstrip())) for _ in range(n)]
d=[[1,0],[0,1],[-1,0],[0,-1]]
def bfs(y,x):
    q=deque()
    q.append((y,x))
    while q:
        y1,x1=q.popleft()
        for dx,dy in d:
            if 0<=y1+dy<n and 0<=x1+dx<m: 
                if graph[y1+dy][x1+dx]==1: 
                    graph[y1+dy][x1+dx]=graph[y1][x1]+1 
                    q.append((y1+dy,x1+dx)) 
bfs(0,0)
print(graph[n-1][m-1])