import sys
input=sys.stdin.readline
t=int(input())
for _ in range(t):
    stack=[]
    vps=list(input())
    for v in vps:
        if v=='(':
            stack.append(v)
        elif v==')':
            if stack and stack[-1]=='(':
                stack.pop()
            else:
                stack.append(v)
    if stack:
        print('NO')
    else:
        print('YES')