def dfs():
    if len(ans)==m:
        print(*ans)
        return
    for i in range(1,n+1):
        #방문하지 않음과 동시에 전에 뽑았던게 더 클때만 뽑아야 함.
        if visited[i]==False and len(ans)==0 or i>ans[-1]:
            visited[i]=True
            ans.append(i)
            dfs()
            visited[i]=False
            ans.pop()

n,m=map(int,input().split())
visited=[False]*(n+1)
ans=[]
dfs()