def solution(s):
    a=[int(i) for i in s.split()]
    return str(min(a))+' '+str(max(a))