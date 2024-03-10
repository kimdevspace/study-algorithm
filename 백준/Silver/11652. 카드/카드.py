import sys
input=sys.stdin.readline
from collections import Counter
n=int(input())
arr=[]
for _ in range(n):
    num=int(input())
    arr.append(num)
cnt=Counter(arr)
cnt=sorted(cnt,key=lambda x:(-cnt[x],x))
print(cnt[0])