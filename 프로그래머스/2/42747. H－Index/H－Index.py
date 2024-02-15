def solution(citations):
    answer = 0
    citations=sorted(citations,reverse=True)
    for idx, cit in enumerate(citations):
        if idx+1<=cit:
            answer+=1
    return answer