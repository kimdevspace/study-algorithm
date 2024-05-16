def dfs(v,cnt):
    global ans
    if cnt>ans:
        ans=cnt
    for i in graph[v]:
        if not visited[i]:
            visited[i]=True
            dfs(i,cnt+1)
            visited[i]=False

t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    graph=[[] for _ in range(n+1)]
    visited=[False]*(n+1)
    for _ in range(m):
        x,y=map(int,input().split())
        graph[x].append(y)
        graph[y].append(x)
    ans=0
    for i in range(1,n+1):
        visited[i]=True
        dfs(i,1)
        visited[i]=False
    print('#'+str(tc),ans)