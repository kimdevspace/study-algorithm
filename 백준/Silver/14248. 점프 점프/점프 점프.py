import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline
n=int(input())
arr=list(map(int,input().split()))
visited=[False]*(n+1)
s=int(input())

cnt=1
def dfs(v):
    global cnt
    for nx in (v+arr[v],v-arr[v]):
        if 0<=nx<n and not visited[nx]:
            cnt+=1
            visited[nx]=True
            dfs(nx)

dfs(s-1)
print(cnt)