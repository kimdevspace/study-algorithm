n=int(input())
dp=[list(map(int,input().split())) for _ in range(n)]

for i in range(1,n):
    for j in range(i+1):
        if j==0: # 맨 왼쪽
            dp[i][j]+=dp[i-1][j]
        elif j==i: # 맨 오른쪽
            dp[i][j]+=dp[i-1][j-1]
        else: # 가운데 중복값이 생길 경우
            dp[i][j]+=max(dp[i-1][j],dp[i-1][j-1])
print(max(dp[n-1]))