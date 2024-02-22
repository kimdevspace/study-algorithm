from collections import Counter
def solution(topping):
    answer = 0
    dic=Counter(topping)
    set_dic=set()
    for t in topping:
        dic[t]-=1
        set_dic.add(t)
        if dic[t]==0:
            dic.pop(t)
        if len(dic)==len(set_dic):
            answer+=1
    return answer