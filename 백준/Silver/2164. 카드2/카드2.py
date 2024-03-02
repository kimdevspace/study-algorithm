import sys
from collections import deque
input=sys.stdin.readline
nlist=deque(sorted([i+1 for i in range(int(input()))],reverse=True))
while len(nlist)>1:
    nlist.pop()
    a=nlist.pop()
    nlist.appendleft(a)
print(*nlist)