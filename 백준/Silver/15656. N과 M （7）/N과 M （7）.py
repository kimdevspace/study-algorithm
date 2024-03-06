n,m=map(int,input().split())
arr=sorted(list(map(int,input().split())))
ans=[]
def dfs():
    if len(ans)==m:
        print(*ans)
        return
    for i in arr:
        ans.append(i)
        dfs()
        ans.pop()
dfs()