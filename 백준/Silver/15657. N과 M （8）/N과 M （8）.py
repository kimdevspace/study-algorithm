n,m=map(int,input().split())
arr=sorted(list(map(int,input().split())))
ans=[]

def dfs():
    if len(ans)==m:
        print(*ans)
        return
    for i in arr:
        if len(ans)==0 or i>=ans[-1]:
            ans.append(i)
            dfs()
            ans.pop()
dfs()