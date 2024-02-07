def solution(n):
    answer='수'
    for i in range(n-1):
        if answer[i]=='수':
            answer+='박'
        elif answer[i]=='박':
            answer+='수'
    return answer