t=int(input())
for tc in range(1,t+1):
    ans=0
    arr=list(map(int,input().split()))
    ans=round(sum(arr)/len(arr))
    print('#'+str(tc),ans)