import sys
input=sys.stdin.readline
n,m=map(int,input().split())
h=set()
for _ in range(n):
    h.add(input().rstrip())
l=set()
for _ in range(m):
    l.add(input().rstrip())
hl=sorted(list(h&l))
print(len(hl))
for i in hl:
    print(i)