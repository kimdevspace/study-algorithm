from math import gcd
ahat,a=map(int,input().split())
bhat,b=map(int,input().split())
s=(ahat*b)+(bhat*a)
m=a*b
gcd=gcd(s,m)
s//=gcd
m//=gcd
print(s,m)