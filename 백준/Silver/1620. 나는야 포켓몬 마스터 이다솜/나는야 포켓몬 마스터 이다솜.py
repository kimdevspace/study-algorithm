import sys
input=sys.stdin.readline
n,m=map(int,input().split())
id={}
name={}
for i in range(1,n+1):
    pok=input().strip()
    id[i]=pok
    name[pok]=i
for _ in range(m):
    find=input().strip()
    if find.isdigit():
        print(id[int(find)])
    else:
        print(name[find])