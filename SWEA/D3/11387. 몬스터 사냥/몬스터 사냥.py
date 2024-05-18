T=int(input())
for tc in range(1,T+1):
    D,L,N=map(int,input().split())
    ans=0
    for i in range(N):
        ans+=D*(1+(i*L*0.01))
    print('#'+str(tc),int(ans))