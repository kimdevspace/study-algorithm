t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=list(map(int,input().split()))
    mean=sum(arr)//n
    ans=0
    for a in arr:
        if mean >= a:
            ans+=1
    print('#'+str(tc),ans)