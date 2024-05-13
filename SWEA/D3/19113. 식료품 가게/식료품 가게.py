t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=list(map(int,input().split()))
    ans=[]
    for i in range(len(arr)):
        w=arr[i]//0.75
        if w%4==0 and w in arr:
            ans.append(arr[i])
            arr[arr.index(w)]-=1
    ans.sort()
    print('#'+str(tc),*ans)