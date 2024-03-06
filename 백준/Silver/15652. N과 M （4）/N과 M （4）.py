def dfs():
    if len(ans)==m:
        print(*ans)
        return
    for i in range(1,n+1):
        if len(ans)==0 or i>=ans[-1]:
            ans.append(i)
            dfs()
            ans.pop()
n,m=map(int,input().split())
ans=[]
dfs()