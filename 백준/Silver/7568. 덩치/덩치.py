import sys
n=int(sys.stdin.readline())
l=[]
for i in range(n):
    x,y=map(int,sys.stdin.readline().split())
    l.append((x,y))
for i in l:
    rank=1
    for j in l:
        if i[0]<j[0] and i[1]<j[1]:
            rank+=1
    print(rank,end=' ')