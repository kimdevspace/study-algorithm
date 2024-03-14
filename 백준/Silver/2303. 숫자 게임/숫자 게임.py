from itertools import combinations
N=int(input())
ans=[]
for i in range(N):
    lst=[]
    arr=list(map(int,input().split()))
    for a in combinations(arr,3):
        if len(str(sum(a)))>1:
            lst.append(int(str(sum(a))[1]))
        else:
            lst.append(sum(a))
    lst.sort()
    ans.append(lst[-1])
if ans.count(max(ans))>=2:
    print(len(ans)-ans[::-1].index(max(ans)))
else:
    print(ans.index(max(ans))+1)