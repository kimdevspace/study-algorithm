def solution(name, yearning, photo):
    answer = []
    for i in photo:
        score=0
        for j in i:
            if j in name:
                score+=yearning[name.index(j)]
            elif j not in name:
                continue
        answer.append(score)
    return answer