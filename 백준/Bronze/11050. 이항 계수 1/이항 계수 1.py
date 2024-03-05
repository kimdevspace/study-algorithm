from itertools import combinations
n,k=map(int,input().split())
nfact=[i+1 for i in range(n)]
cnt=0
for p in combinations(nfact,k):
    cnt+=1
print(cnt)