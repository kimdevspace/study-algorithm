from collections import deque
n,k=map(int,input().split())
MAX=10**5
distance=[0]*(MAX+1) #거리 

def bfs(n):
    q=deque([n])
    while q:
        x=q.popleft()
        if x==k:
            return distance[x]
        for nx in (x-1,x+1,x*2):
            if 0<=nx<=MAX and not distance[nx]:
                distance[nx]=distance[x]+1
                q.append(nx)
print(bfs(n))