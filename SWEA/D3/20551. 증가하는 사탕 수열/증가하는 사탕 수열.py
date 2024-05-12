t=int(input())
for tc in range(1,t+1):
    arr=list(map(int,input().split()))
    cnt=0
    for i in range(1,-1,-1):
        while arr[i]>=arr[i+1] and arr[i]!=1:
            arr[i]-=1
            cnt+=1
    print('#'+str(tc),end=' ')
    if arr[0]<arr[1] and arr[1]<arr[2] and arr[0]<arr[2]:
        print(cnt)
    else:
        print(-1)