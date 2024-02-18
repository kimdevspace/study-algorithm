def solution(msg):
    answer = []
    dic={chr(i+64):i for i in range(1,27)}
    start,end=0,1
    idx=27
    while end<len(msg)+1:
        w=msg[start:end]
        if w in dic:
            end+=1
        else:
            answer.append(dic[w[:-1]])
            dic[w]=idx
            idx+=1
            start=end-1
    answer.append(dic[w])
    return answer