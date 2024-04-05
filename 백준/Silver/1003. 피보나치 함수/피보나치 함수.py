t=int(input())
for _ in range(t):
    a,b=1,0
    n=int(input())
    for i in range(n):
        a,b=b,a+b
    print(a,b)