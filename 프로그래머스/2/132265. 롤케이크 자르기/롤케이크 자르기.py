from collections import Counter
def solution(topping):
    answer=0
    dic=Counter(topping)
    div=set()
    for t in topping:
        dic[t]-=1
        div.add(t)
        if dic[t]==0:
            dic.pop(t)
        if len(dic)==len(div):
            answer+=1
    return answer