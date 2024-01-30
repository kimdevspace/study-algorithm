def solution(arr):
    a=[len(i) for i in arr]
    tmp=[]
    for i in set(a): 
        tmp.append(a.count(i))
    return max(tmp)