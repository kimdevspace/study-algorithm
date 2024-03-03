#에라토스테네스의 체
primes=[False,False]+[True]*999999
for i in range(2,int(999999**0.5)+1):
    if primes[i]:
        for j in range(i*2,1000001,i):
            primes[j]=False
t=int(input())
for i in range(t):
    cnt=0
    n=int(input())
    for j in range(2,n//2+1):
        if primes[j] and primes[n-j]:
            cnt+=1
    print(cnt)