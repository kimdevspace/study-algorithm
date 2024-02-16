def solution(want, number, discount):
    n=len(discount)
    answer=0
    for i in range(n-9):
        dic={w:0 for w in want}
        for j in range(i,i+10):
            if discount[j] in dic:
                dic[discount[j]]+=1
        if list(dic.values())==number:
            answer+=1
    return answer