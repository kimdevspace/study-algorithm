def dfs(n,res,add,sub,mul,div):
    global mn,mx
    if res<int(-1e9) or int(1e9)<res: #-10억 ~ 10억
        return 
    if n==N: #종료 조건, 최대 최소 갱신
        mn=min(mn,res)
        mx=max(mx,res)
        return
    #하부 함수 구현 (동작 구현)
    if add>0:
        dfs(n+1,res+lst[n],add-1,sub,mul,div)
    if sub>0:
        dfs(n+1,res-lst[n],add,sub-1,mul,div)
    if mul>0:
        dfs(n+1,res*lst[n],add,sub,mul-1,div)
    if div>0:
        dfs(n+1,int(res/lst[n]),add,sub,mul,div-1)
N=int(input())
lst=list(map(int,input().split()))
add,sub,mul,div=map(int,input().split()) #연산자 갯수
mn,mx=int(1e9),int(-1e9)
dfs(1,lst[0],add,sub,mul,div)
print(mx,mn,sep='\n')