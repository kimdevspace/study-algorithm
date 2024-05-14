for tc in range(1,11):
    n=int(input())
    arr=[list(map(int,input().split())) for _ in range(100)]
    arr_t=list(map(list,zip(*arr)))
    ans=[]
    for a in arr:
        ans.append(sum(a))
    for at in arr_t:
        ans.append(sum(at))

    x,y=0,0    
    for i in range(len(arr)):
        idx=len(arr)-i-1
        x+=arr[i][i]
        y+=arr[i][idx]
    ans.append(x)
    ans.append(y)
    print('#'+str(tc),max(ans))