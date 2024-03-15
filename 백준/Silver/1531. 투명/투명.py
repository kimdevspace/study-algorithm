n,m=map(int,input().split())
picture=[[0 for i in range(101)] for i in range(101)]
for _ in range(n):
    lst=list(map(int,input().split()))
    for i in range(lst[0],lst[2]+1):
        for j in range(lst[1],lst[3]+1):
            picture[i][j]+=1
cnt=0
for i in range(len(picture)):
    for j in range(len(picture)):
        if picture[i][j]>m:
            cnt+=1
print(cnt)