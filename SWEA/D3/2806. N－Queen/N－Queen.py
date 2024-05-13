def dfs(i):
    global ans
    if i==n:
        ans+=1
        return
    for j in range(n):
        if not (v1[j] or v2[i+j] or v3[i-j]):
            v1[j],v2[i+j],v3[i-j]=1,1,1
            dfs(i+1)
            v1[j],v2[i+j],v3[i-j]=0,0,0

t=int(input())
for tc in range(1,t+1):
    n=int(input())
    ans=0
    v1,v2,v3=[[0]*(2*n) for _ in range(3)]
    dfs(0)
    print('#'+str(tc),ans)