def solution(n):
    dp=[0]*n
    dp[0],dp[1]=1,2
    for i in range(2,len(dp)):
        dp[i]=(dp[i-2]+dp[i-1])%1000000007
    return dp[i]