for tc in range(1,11):
    n=int(input())
    arr=list(map(int,input().split()))
    cycle=[1,2,3,4,5]
    i=0
    while True:
        arr.append(arr.pop(0)-cycle[i%5])
        i+=1
        if arr[-1]<=0:
            arr[-1]=0
            break
    print('#'+str(tc),*arr)