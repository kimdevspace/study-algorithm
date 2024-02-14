def solution(k, tangerine):
    answer = 0
    dic={}
    for tan in tangerine:
        if tan in dic:
            dic[tan]+=1
        else:
            dic[tan]=1
    dic=sorted(dic.items(),key=lambda x:x[1],reverse=True)
    for i in dic:
        answer+=1
        k-=i[1]
        if k<=0:
            break
    return answer