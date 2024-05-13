t=int(input())
for tc in range(1,t+1):
    n=int(input())
    arr=list(map(int,input().split()))
    ans=[]
    for i in range(len(arr)):
        tmp=arr[i]//0.75
        if tmp%4==0 and tmp in arr:
            ans.append(arr[i])
            arr[arr.index(tmp)]-=1
    ans.sort()
    print('#'+str(tc),*ans)