import sys
input=sys.stdin.readline
k=int(input())

height=[]
width=[]
total=[]
for i in range(6):
    d,l=map(int,input().split())
    if d==1 or d==2:
        width.append(l)
    else:
        height.append(l)
    total.append(l)

max_height=max(height)
max_width=max(width)

min_height=total[total.index(max_width)-3]
min_width=total[total.index(max_height)-3]
print(k*(max_height*max_width-min_height*min_width))