t=int(input())
for tc in range(1,t+1):
    arr=[list(input()) for _ in range(5)]
    l=0
    for a in arr:
        l=max(l,len(a))
    for i in range(len(arr)):
        arr[i]=arr[i]+['']*(l-len(arr[i]))
    arr_t=list(zip(*arr))
    print('#'+str(tc),end=' ')
    for at in arr_t:
        print(''.join(at),end='')
    print()