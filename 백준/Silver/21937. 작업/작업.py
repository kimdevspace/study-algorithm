import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n,m=map(int,input().split())
graph=[[] for _ in range(n+1)]
visited=[False]*(n+1)
for _ in range(m):
    a,b=map(int,input().split())
    graph[b].append(a)
cnt=0
def dfs(v):
    global cnt
    visited[v]=True
    for i in graph[v]:
        if not visited[i]:
            dfs(i)
            cnt+=1

x=int(input())
dfs(x)
print(cnt)