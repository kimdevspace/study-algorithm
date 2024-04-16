import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n,m,r=map(int,input().split())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    u,v=map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)
visited=[False]*(n+1)
ans=[0]*(n+1)

for g in graph:
    g.sort(reverse=True)

cnt=1
def dfs(v):
    global cnt
    visited[v]=True
    ans[v]=cnt
    for i in graph[v]:
        if not visited[i]:
            cnt+=1
            dfs(i)
dfs(r)
for a in ans[1:]:
    print(a)