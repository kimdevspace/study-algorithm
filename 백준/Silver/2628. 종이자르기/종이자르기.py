import sys
input=sys.stdin.readline
w,h=map(int,input().split())
width=[0,w]
height=[0,h]
for _ in range(int(input())):
    a,b=map(int,input().split())
    if a==0: #가로
        height.append(b)
    else: #세로
        width.append(b)
#넓이 구하기
width.sort()
height.sort()
res=0
for i in range(len(width)-1):
    for j in range(len(height)-1):
        x=width[i+1]-width[i]
        y=height[j+1]-height[j]
        res=max(res,x*y)
print(res)