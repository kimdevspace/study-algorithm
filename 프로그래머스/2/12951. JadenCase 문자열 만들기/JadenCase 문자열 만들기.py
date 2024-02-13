def solution(s):
    answer = []
    for i in s.split(' '):
        answer.append(i[0:1].upper()+i[1:].lower())
    return ' '.join(answer)