import sys
input=sys.stdin.readline
n=int(input())
cnt=0
for _ in range(n):
    word=input().rstrip()
    stack=[]
    for w in word:
        if stack and w==stack[-1]:
            stack.pop()
        else:
            stack.append(w)
    if not stack:
        cnt+=1
print(cnt)