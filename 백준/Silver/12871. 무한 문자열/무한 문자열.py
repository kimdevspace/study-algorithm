from math import gcd
s=input()
t=input()
lcm=len(s)*len(t)//gcd(len(s),len(t))
sl=lcm//len(s)
tl=lcm//len(t)
if s*sl==t*tl:
    print(1)
else:
    print(0)