n=int(input())
s=0
if n==0:
    print(0)
else:
    for i in range(n-1,1,-1):
        n=n*i
    cnt=list(str(n))
    cnt=cnt[-1::-1]
    for c in cnt:
        if c!='0':
            break
        s+=1
    print(s)