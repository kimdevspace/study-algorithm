import sys
from collections import deque
input=sys.stdin.readline
n,m,k,x=map(int,input().split())
graph=[[] for _ in range(n+1)]
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)

dist=[-1]*(n+1)
dist[x]=0

q=deque()
q.append(x)
while q:
    now=q.popleft()
    for i in graph[now]:
        if dist[i]==-1:
            dist[i]=dist[now]+1
            q.append(i)

flag=False
for i in range(1,n+1):
    if dist[i]==k:
        print(i)
        flag=True
if flag==False:
    print(-1)