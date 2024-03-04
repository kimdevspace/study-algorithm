import sys
input=sys.stdin.readline
from collections import deque
answer=deque()
n=int(input())
for _ in range(n):
    com=input().split()
    if com[0]=='1':
        answer.appendleft(com[1])
    elif com[0]=='2':
        answer.append(com[1])
    elif com[0]=='3':
        if answer:
            print(answer.popleft())
        else:
            print(-1)
    elif com[0]=='4':
        if answer:
            print(answer.pop())
        else:
            print(-1)
    elif com[0]=='5':
        print(len(answer))
    elif com[0]=='6':
        if not answer:
            print(1)
        else:
            print(0)
    elif com[0]=='7':
        if answer:
            print(answer[0])
        else:
            print(-1)
    elif com[0]=='8':
        if answer:
            print(answer[-1])
        else:
            print(-1)