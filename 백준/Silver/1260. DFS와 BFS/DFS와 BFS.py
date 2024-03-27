from collections import deque
n,m,v=map(int,input().split())
#인접행렬생성
graph=[[False]*(n+1) for _ in range(n+1)]
for _ in range(m):
    x,y=map(int,input().split())
    graph[x][y]=1
    graph[y][x]=1

##dfs
vis1=[False]*(n+1) #dfs 방문확인
def dfs(v):
    vis1[v]=True #방문
    print(v,end=' ') #방문한 곳 출력
    for i in range(1,n+1):
        if not vis1[i] and graph[v][i]==1:
            dfs(i)

##bfs
vis2=[False]*(n+1)
def bfs(v):
    q=deque([v])
    vis2[v]=True
    while q:
        v=q.popleft()
        print(v,end=' ')
        for i in range(1,n+1):
            if not vis2[i] and graph[v][i]==1:
                q.append(i)
                vis2[i]=True

dfs(v)
print()
bfs(v)