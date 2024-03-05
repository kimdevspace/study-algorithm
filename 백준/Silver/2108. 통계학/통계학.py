import sys
from collections import Counter
input=sys.stdin.readline
n=int(input())
if n>1:
    arr=[]
    for _ in range(n):
        arr.append(int(input()))
    arr.sort()
    cnt=Counter(arr)
    mode=cnt.most_common(2)
    print(round(sum(arr)/len(arr)))
    print(arr[len(arr)//2])
    print(mode[1][0] if mode[0][1]==mode[1][1] else mode[0][0])
    print(max(arr)-min(arr))
else:
    k=int(input())
    print(k)
    print(k)
    print(k)
    print(0)