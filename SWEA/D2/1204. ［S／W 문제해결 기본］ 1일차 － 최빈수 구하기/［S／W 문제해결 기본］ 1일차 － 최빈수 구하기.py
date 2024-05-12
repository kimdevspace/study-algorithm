t=int(input())
for tc in range(1,t+1):
    arr=[0]*101
    n=int(input())
    lst=list(map(int,input().split()))
    for l in lst:
        arr[l]+=1
    arr_r=arr[::-1]
    print('#'+str(tc),100-arr_r.index(max(arr_r)))