t=int(input())
for tc in range(1,t+1):
    n,m,k=map(int,input().split())
    lst=list(map(int,input().split()))
    lst.sort()
    ans='Possible'
    cnt=0
    for l in lst:
        cnt+=1
        if (l//m)*k < cnt:
            ans='Impossible'
            break
    print('#'+str(tc),ans)