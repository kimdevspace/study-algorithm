def solution(sizes):
    a=[max(x) for x in sizes]
    b=[min(x) for x in sizes]
    return max(a)*max(b)