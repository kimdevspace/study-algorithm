def solution(citations):
    answer = 0
    for idx, cit in enumerate(sorted(citations,reverse=True)):
        if idx+1<=cit:
            answer+=1
    return answer