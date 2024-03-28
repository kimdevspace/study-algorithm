n=int(input())
a,b=map(int,input().split())
m=int(input())
graph=[[] for _ in range(n+1)]
visited=[False]*(n+1)
res=[]

for _ in range(m):
    x,y=map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(v,num):
    num+=1
    visited[v]=True
    
    if v==b:
        res.append(num)
    for i in graph[v]:
        if visited[i]==False:
            dfs(i,num)

dfs(a,0)
print(-1 if not res else res[0]-1)