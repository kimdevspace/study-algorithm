def isPrime(n):
    if n>=2:
        for i in range(2,int(n**0.5)+1):
            if n%i==0:
                return False
        return True
    else:
        return False
n,m=map(int,input().split())
for i in range(n,m+1):
    if isPrime(i):
        print(i)