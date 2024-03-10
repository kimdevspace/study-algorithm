from collections import deque
import sys
input=sys.stdin.readline
n,m=map(int,input().split())
pos=list(map(int,input().split()))
cnt=0
que=deque([i for i in range(1,n+1)])
for p in pos:
    while True:
        if p==que[0]:
            que.popleft()
            break
        else:
            if que.index(p)<=len(que)//2:
                que.rotate(-1)
                cnt+=1
            else:
                que.rotate(1)
                cnt+=1
print(cnt)