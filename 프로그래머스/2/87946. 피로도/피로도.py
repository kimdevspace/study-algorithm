#순열을 이용하여 푼다.
from itertools import permutations
def solution(k, dungeons):
    answer = 0
    for p in permutations(dungeons,len(dungeons)):
        cnt=0
        tmp=k
        for need,spend in p:
            if need<=tmp:
                tmp-=spend
                cnt+=1
        answer=max(answer,cnt)
    return answer