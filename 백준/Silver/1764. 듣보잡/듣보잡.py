n,m=map(int,input().split())
h,l=set(),set()
for _ in range(n):
    h.add(input())
for _ in range(m):
    l.add(input())
hl=h&l
print(len(hl))
hl=sorted(list(hl))
for i in range(len(hl)):
    print(hl[i])