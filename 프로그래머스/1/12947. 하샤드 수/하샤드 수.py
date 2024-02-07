def solution(x):
    s=0
    for i in str(x):
        s+=int(i)
    if x%s==0:
        return True
    else:
        return False