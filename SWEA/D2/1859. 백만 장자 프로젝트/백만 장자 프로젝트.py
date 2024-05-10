t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=list(map(int,input().split()))
    sell=0
    ans=0
    for a in arr[::-1]:
        if a>sell:
            sell=a
        else:
            ans+=sell-a
    print('#'+str(tc),ans)