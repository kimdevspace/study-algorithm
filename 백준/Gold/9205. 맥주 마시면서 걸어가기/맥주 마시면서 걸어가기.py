from collections import deque
t=int(input())

def bfs(x,y):
    q=deque([(x,y)])
    while q:
        x,y=q.popleft()
        if abs(x-fx)+abs(y-fy)<=1000:
            return 'happy'
        for i in range(n):
            if not visited[i]:
                nx,ny=graph[i]
                if abs(x-nx)+abs(y-ny)<=1000:
                    visited[i]=1
                    q.append((nx,ny))
    return 'sad'

for _ in range(t):
    n=int(input())
    hx,hy=map(int,input().split())
    graph=[]
    for _ in range(n):
        x,y=map(int,input().split())
        graph.append((x,y))
    fx,fy=map(int,input().split())
    visited=[0 for _ in range(n+1)]
    print(bfs(hx,hy))