def solution(n):
    thr=''
    ans=0
    while n>=1:
        thr+=str(n%3)
        n//=3
    thr=thr[::-1]
    for i in range(len(thr)):
        ans+=int(thr[i])*(3**i)
    return ans