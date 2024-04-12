def solution(n):
    res=[]
    while n:
        t=n%3
        if t==0:
            t=4
            n-=1
        n//=3
        res.append(str(t))
    return ''.join(res[::-1])