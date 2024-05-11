t=int(input())
for tc in range(1,t+1):
    arr=list(map(int,input().split()))
    del arr[arr.index(max(arr))]
    del arr[arr.index(min(arr))]
    print('#'+str(tc),round(sum(arr)/len(arr)))