s=input()
n=len(s)
a=set()
for i in range(n):
    for j in range(i,n):
        a.add(s[i:j+1])
print(len(a))