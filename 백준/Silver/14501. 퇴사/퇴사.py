n=int(input())
arr=[list(map(int,input().split())) for _ in range(n)]
dp=[0 for _ in range(n+1)]
for i in range(n):
    for j in range(arr[i][0]+i,n+1):
        if dp[j]<dp[i]+arr[i][1]:
            dp[j]=dp[i]+arr[i][1]
print(dp[-1])