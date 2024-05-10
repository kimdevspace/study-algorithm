n=int(input())
arr=list(map(int,input().split()))

for i in range(n-1,0,-1):
    if arr[i]<arr[i-1]:
        x=i-1
        for j in range(n-1,0,-1):
            if arr[j]<arr[x]:
                arr[j],arr[x]=arr[x],arr[j]
                arr=arr[:i]+sorted(arr[i:],reverse=True)
                print(*arr)
                exit(0)
print(-1)                