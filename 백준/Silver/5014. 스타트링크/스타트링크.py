from collections import deque
F,S,G,U,D=map(int,input().split())
visited=[0]*(F+1)

def bfs(S):
    q=deque([S])
    visited[S]=1
    while q:
        x=q.popleft()
        if x==G:
            return visited[x]-1
        for nx in (x+U,x-D):
            if 0<nx<=F and not visited[nx]:
                visited[nx]=visited[x]+1
                q.append(nx)
    if visited[G]==0:
        return 'use the stairs'
print(bfs(S))