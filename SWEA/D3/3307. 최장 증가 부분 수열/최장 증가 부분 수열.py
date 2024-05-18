t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=list(map(int,input().split()))
    dp=[1]*n
    for i in range(1,n):
        for j in range(i):
            if arr[i]>=arr[j]:
                dp[i]=max(dp[j]+1,dp[i])
    print('#'+str(tc),max(dp))