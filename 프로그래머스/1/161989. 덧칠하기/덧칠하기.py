def solution(n, m, section):
    nop=0
    answer=0
    for i in section:
        if i>nop:
            nop=i+m-1
            answer+=1
    return answer