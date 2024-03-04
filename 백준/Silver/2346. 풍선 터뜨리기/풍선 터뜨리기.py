from collections import deque
import sys
input=sys.stdin.readline
n=int(input())
que=deque([(idx+1,i) for idx, i in enumerate(list(map(int,input().split())))])
answer=[]
while que:
    idx,paper=que.popleft()
    answer.append(idx)
    if paper>0:
        que.rotate(-(paper-1))
    elif paper<0:
        que.rotate(-paper)
print(' '.join(map(str,answer)))