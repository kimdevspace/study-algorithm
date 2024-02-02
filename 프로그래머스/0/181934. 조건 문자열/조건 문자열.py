def solution(ineq, eq, n, m):
    if eq=='!':
        eq=''
    answer=str(n)+ineq+eq+str(m)
    return 1 if eval(answer) else 0