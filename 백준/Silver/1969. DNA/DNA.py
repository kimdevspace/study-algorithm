n,m=map(int,input().split())
lst=[list(input()) for _ in range(n)]
dna=''
cnt=0
for i in range(m):
    arr=[]
    for j in range(n):
        arr.append(lst[j][i])
    arr.sort()
    dna+=max(arr,key=arr.count)
    cnt+=len(arr)-arr.count(max(arr,key=arr.count))
print(dna)
print(cnt)