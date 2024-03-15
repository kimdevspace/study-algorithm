n,d=map(int,input().split())
lst=[i for i in range(1,n+1)]
cnt=0
for l in lst:
    for j in str(l):
        if int(j)==d:
            cnt+=1
print(cnt)