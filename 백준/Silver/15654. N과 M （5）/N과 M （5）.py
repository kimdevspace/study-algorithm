n,m=map(int,input().split())
arr=sorted(list(map(int,input().split())))
ans=[]
visit=[False]*(max(arr)+1)
def dfs():
    if len(ans)==m:
        print(*ans)
        return
    for i in arr:
        if not visit[i]:
            visit[i]=True
            ans.append(i)
            dfs()
            visit[i]=False
            ans.pop()
dfs()