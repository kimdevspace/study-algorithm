def solution(priorities, location):
    answer = []
    que=[(i,p) for i,p in enumerate(priorities)]
    while que:
        process=que.pop(0)
        if process and any(process[1]<q[1] for q in que):
            que.append(process)
        else:
            answer.append(process)
    for i in answer:
        if i[0]==location:
            return answer.index(i)+1