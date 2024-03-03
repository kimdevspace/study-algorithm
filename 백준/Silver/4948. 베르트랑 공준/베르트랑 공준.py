import sys
input=sys.stdin.readline
r=123456*2
primes=[False,False]+[True]*(r-1)
for i in range(2,int(r**0.5)+1):
    if primes[i]==True:
        for j in range(i*2,r+1,i):
            primes[j]=False
while  True:
    n=int(input())
    if n==0:
        break
    print(primes[n+1:(2*n)+1].count(True))