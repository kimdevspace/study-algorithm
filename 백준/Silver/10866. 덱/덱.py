import sys
from collections import deque
que=deque()
n=int(sys.stdin.readline())
for _ in range(n):
    com=sys.stdin.readline().split()
    if com[0]=='push_front':
        que.appendleft(com[1])
    elif com[0]=='push_back':
        que.append(com[1])
    elif com[0]=='pop_front':
        if que:
            print(que.popleft())
        else:
            print(-1)
    elif com[0]=='pop_back':
        if que:
            print(que.pop())
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