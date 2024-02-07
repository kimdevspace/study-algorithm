def solution(n):
    a=''
    n=sorted([str(i) for i in (str(n))],reverse=True)
    for i in n:
        a+=i
    return int(a)