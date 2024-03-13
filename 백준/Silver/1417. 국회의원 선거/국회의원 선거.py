n=int(input())
arr=[]
cnt=0
for _ in range(n):
    arr.append(int(input()))
if n==1:
    print(0)
else:
    while True:
        if arr[0]>max(arr[1:]):
            break
        else:
            idx=arr[1:].index(max(arr[1:]))+1
            arr[idx]-=1
            arr[0]+=1
            cnt+=1
    print(cnt)