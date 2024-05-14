for tc in range(1,11):
    cnt=int(input())
    arr=list(map(int,input().split()))
    for _ in range(cnt):
        arr[arr.index(max(arr))]-=1
        arr[arr.index(min(arr))]+=1
    print('#'+str(tc),max(arr)-min(arr))