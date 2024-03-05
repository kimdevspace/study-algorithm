def fact(n):
    cnt=1
    for i in range(2,n+1):
        cnt*=i
    return cnt
t=int(input())
for _ in range(t):
    n,m=map(int,input().split())
    print(fact(m)//(fact(n)*fact(m-n)))