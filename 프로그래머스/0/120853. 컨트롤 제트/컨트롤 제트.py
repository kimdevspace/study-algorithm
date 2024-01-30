def solution(s):
    answer=[]
    for i in s.split():
        if i=='Z':
            answer.pop()
            continue
        answer.append(int(i))
    return sum(answer)