import sys
from collections import deque
input=sys.stdin.readline
from collections import deque
que=deque()
for _ in range(int(input())):
    com=input().split()
    if com[0]=='push':
        que.append(com[1])
    elif com[0]=='pop':
        if que:
            print(que.popleft())
        else:
            print(-1)
    elif com[0]=='size':
        print(len(que))
    elif com[0]=='empty':
        if not que:
            print(1)
        else:
            print(0)
    elif com[0]=='front':
        if que:
            print(que[0])
        else:
            print(-1)
    elif com[0]=='back':
        if que:
            print(que[-1])
        else:
            print(-1)