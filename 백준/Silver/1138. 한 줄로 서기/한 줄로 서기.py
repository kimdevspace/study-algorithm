n=int(input())
lst=list(map(int,input().split()))
arr=[0]*n
for i in range(n):
    cnt=0
    for j in range(n):
        if cnt==lst[i] and arr[j]==0:
            arr[j]=i+1
            break
        elif arr[j]==0:
            cnt+=1
print(*arr)