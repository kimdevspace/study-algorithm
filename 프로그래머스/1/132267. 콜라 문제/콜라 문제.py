def solution(a, b, n):
    quo=0
    while n>=a:
        quo+=((n//a)*b)
        n=(n%a)+((n//a)*b)
    return quo