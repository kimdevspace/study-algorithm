from collections import deque
n,m=map(int,input().split())
friends=[[] for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    friends[a].append(b)
    friends[b].append(a)
def bfs(v):
    q=deque([v])
    visited[v]=1
    while q:
        tg=q.popleft()
        for i in friends[tg]:
            if not visited[i]:
                visited[i]=visited[tg]+1
                q.append(i)
res=[]               
for i in range(1,n+1):
    visited=[0]*(n+1)
    bfs(i)
    res.append(sum(visited))
print(res.index(min(res))+1)