t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=[list(map(int,input().split())) for _ in range(n)]
    arr_90=list(map(list,zip(*arr[::-1])))
    arr_180=list(map(list,zip(*arr_90[::-1])))
    arr_270=list(map(list,zip(*arr_180[::-1])))

    print('#'+str(tc))
    for i in range(len(arr)):
        print(''.join(map(str,arr_90[i])),end=' ')
        print(''.join(map(str,arr_180[i])),end=' ')
        print(''.join(map(str,arr_270[i])))