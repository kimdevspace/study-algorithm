import sys
input=sys.stdin.readline
M=int(input())
S=set()
for _ in range(M):
    com=input().split()
    if com[0]=='add':
        if com[1] in S:
            continue
        else:
            S.add(com[1])
    elif com[0]=='remove':
        if com[1] not in S:
            continue
        else:
            S.remove(com[1])
    elif com[0]=='check':
        if com[1] in S:
            print(1)
        else:
            print(0)
    elif com[0]=='toggle':
        if com[1] in S:
            S.remove(com[1])
        else:
            S.add(com[1])
    elif com[0]=='all':
        S=set(str(i) for i in range(1,21))
    elif com[0]=='empty':
        S=set()