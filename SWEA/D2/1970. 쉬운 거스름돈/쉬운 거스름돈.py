t=int(input())
cost=[50000,10000,5000,1000,500,100,50,10]
for tc in range(1,t+1):
    n=int(input())
    ans=[0]*len(cost)
    for i in range(len(cost)):
        cnt=0
        if n>=cost[i]:
            cnt=n//cost[i]
            ans[i]=cnt
            n-=cost[i]*cnt
    print('#'+str(tc))
    print(*ans)