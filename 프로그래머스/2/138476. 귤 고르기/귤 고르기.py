from collections import Counter
def solution(k, tangerine):
    answer=0
    cnt=Counter(tangerine)
    for i in sorted(cnt.values(),reverse=True):
        answer+=1
        k-=i
        if k<=0:
            break
    return answer