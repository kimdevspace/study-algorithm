def solution(clothes):
    dic={}
    for n,t in clothes:
        if t in dic:
            dic[t]+=[n]  
        else:
            dic[t]=[n]
    count=1
    for _,val in dic.items():
        count*=len(val)+1
    return count-1