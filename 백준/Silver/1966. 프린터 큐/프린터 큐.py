import sys
from collections import deque
input=sys.stdin.readline
t=int(input())
for i in range(t):
    n,m=map(int,input().split())
    data=deque(map(int,input().split()))
    data=deque([(idx,i) for i,idx in enumerate(data)])
    count=0
    while True:
        if data[0][0]==max(data,key=lambda x:x[0])[0]:
            count+=1
            if data[0][1]==m:
                print(count)
                break
            else:
                data.popleft()
        else:
            data.append(data.popleft())