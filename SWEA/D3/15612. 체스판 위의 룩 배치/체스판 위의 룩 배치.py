t=int(input())
for tc in range(1,t+1):
    arr=[list(input()) for _ in range(8)]
    arr_t=list(zip(*arr))

    res=True
    for i in range(8):
        if arr[i].count('O')!=1:
            res=False
            break
        if arr_t[i].count('O')!=1:
            res=False
            break
    if res:
        print('#'+str(tc),'yes')
    else:
        print('#' + str(tc),'no')