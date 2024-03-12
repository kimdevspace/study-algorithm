arr=[[0 for i in range(100)] for i in range(100)]
for _ in range(4):
    a,b,c,d=map(int,input().split())
    for i in range(a,c):
        for j in range(b,d):
            arr[i][j]=1
cnt=0
for i in range(len(arr)):
    for j in range(len(arr[0])):
        if arr[i][j]==1:
            cnt+=1
print(cnt)
