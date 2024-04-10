import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
N,R,Q=map(int,input().split())
graph=[[] for _ in range(N+1)]
cnt=[0]*(N+1)
for _ in range(N-1):
    U,V=map(int,input().split())
    graph[U].append(V)
    graph[V].append(U)
def dfs(v):
    cnt[v]=1
    for i in graph[v]:
        if not cnt[i]:
            dfs(i)
            cnt[v]+=cnt[i]
dfs(R)
for _ in range(Q):
    print(cnt[int(input())])
