def solution(n, lost, reserve):
    #r,l 지정하는 이유:마지막 제한사항
    r=set(reserve)-set(lost)
    l=set(lost)-set(reserve)
    for i in r:
        if i-1 in l:
            l.remove(i-1)
        elif i+1 in l:
            l.remove(i+1)
    return n-len(l)