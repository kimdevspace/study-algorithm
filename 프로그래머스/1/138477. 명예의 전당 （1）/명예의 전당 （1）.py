def solution(k, score):
    answer = []
    honor=[]
    for i in range(len(score)):
        honor.append(score[i])
        honor=sorted(honor,reverse=True)
        if len(honor)>k:
            honor.pop()
        answer.append(min(honor))
    return answer