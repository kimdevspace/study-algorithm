def solution(array):
    res=0
    a=[str(i) for i in array]
    for i in range(len(a)):
        for j in range(len(a[i])):
            if a[i][j]=='7':
                res+=1
    return res
            