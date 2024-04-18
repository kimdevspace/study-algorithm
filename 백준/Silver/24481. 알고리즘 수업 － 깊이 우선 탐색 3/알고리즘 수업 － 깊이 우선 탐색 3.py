import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n,m,r=map(int,input().split())
graph=[[] for _ in range(n+1)]
visited=[-1]*(n+1)

def dfs(v,depth):
    visited[v]=depth
    for i in graph[v]:
        if visited[i]==-1:
            dfs(i,depth+1)

for _ in range(m):
    u,v=map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)
for i in graph:
    i.sort()
dfs(r,0)
for i in range(1,n+1):
    print(visited[i])