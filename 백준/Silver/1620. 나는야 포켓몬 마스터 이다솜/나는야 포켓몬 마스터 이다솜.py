from sys import stdin
def input():
    return stdin.readline().rstrip()
n,m=map(int,input().split())
id={}
name={}
for i in range(1,n+1):
    p=input()
    id[i]=p
    name[p]=i
for _ in range(m):
    x=input()
    if x.isdigit():
        print(id[int(x)])
    else:
        print(name[x])