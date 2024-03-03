def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True
t=int(input())
for _ in range(t):
    n=int(input())
    if n>2:
        while True:
            if isPrime(n):
                print(n)
                break
            n+=1
    else:
        print(2)