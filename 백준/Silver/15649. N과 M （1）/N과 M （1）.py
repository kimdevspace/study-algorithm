from itertools import permutations
n,m=map(int,input().split())
arr=[i+1 for i in range(n)]
res=(list(permutations(arr,m)))
for i in range(len(res)):
    print(' '.join(map(str,res[i])))