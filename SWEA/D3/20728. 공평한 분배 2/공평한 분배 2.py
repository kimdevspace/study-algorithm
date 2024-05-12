t=int(input())
for tc in range(1,t+1):    
    n,k=map(int,input().split())
    arr=list(map(int,input().split()))
    arr.sort()
    ans=int(1e9)
    for i in range(n-k+1):
        diff=arr[i+k-1]-arr[i]
        ans=min(diff,ans)
    print('#'+str(tc),ans)