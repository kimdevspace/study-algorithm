import sys
input=sys.stdin.readline
N=int(input())
que=[]
for _ in range(N):
    com=input().split()
    if com[0]=='push':
        que.append(com[1])
    elif com[0]=='pop':
        if que:
            print(que.pop(0))
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