import sys
input=sys.stdin.readline
stack=[]
answer=[]
find=True
currentnum=1
for _ in range(int(input())):
    num=int(input())
    while currentnum<=num:
        stack.append(currentnum)
        answer.append('+')
        currentnum+=1
    if stack[-1]==num:
        stack.pop()
        answer.append('-')
    else:
        find=False
if not find:
    print('NO')
else:
    for i in answer:
        print(i)