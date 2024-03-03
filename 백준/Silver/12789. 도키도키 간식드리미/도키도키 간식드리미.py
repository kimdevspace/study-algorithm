import sys
input=sys.stdin.readline
n=int(input())
wait=list(map(int,input().split()))
stack=[]
target=1
while wait:
    if wait[0]==target:
        wait.pop(0)
        target+=1
    else:
        stack.append(wait.pop(0))
    while stack:
        if stack[-1]==target:
            stack.pop()
            target+=1
        else:
            break
print('Nice' if not stack else 'Sad')