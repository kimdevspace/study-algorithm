import sys
input=sys.stdin.readline
def dfs(x):
    global ans
    if x==n:
        ans+=1 #n행까지 진행했을 경우 경우의수 추가!
        return
    for j in range(n):
        if v1[j]==v2[x+j]==v3[x-j]==0: #열, 대각선 모두 방문하지 않은 경우
            v1[j]=v2[x+j]=v3[x-j]=1 #방문처리 해준 후
            dfs(x+1) #다음 행으로
            v1[j]=v2[x+j]=v3[x-j]=0 #방문처리 해제 why? 다음 dfs를 진행하기 위해
n=int(input())
ans=0
v1=[0]*n
v2=[0]*(2*n)
v3=[0]*(2*n)
dfs(0)
print(ans)