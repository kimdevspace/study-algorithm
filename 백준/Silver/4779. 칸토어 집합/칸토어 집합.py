import sys
input=sys.stdin.readline
def canto(a,n):
    if n==1:
        return 1
    for i in range(a+n//3,a+(n//3)*2):
        res[i]=' '
    canto(a,n//3)
    canto(a+(n//3)*2,n//3)
while True:
    try:
        n=int(input())
        res=['-']*(3**n)
        canto(0,3**n)
        print(''.join(res))
    except:
        break