from collections import deque
def solution(priorities, location):
    answer = []
    que=deque((i,j) for i,j in enumerate(priorities))
    while que:
        process=que.popleft()
        if que and any(process[1]<q[1] for q in que):
            que.append(process)
        else:
            answer.append(process)
    for i in answer:
        if i[0]==location:
            return answer.index(i)+1