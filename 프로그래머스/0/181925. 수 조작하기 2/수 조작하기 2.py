def solution(numLog):
    answer = []
    for i in range(1,len(numLog)):
        if numLog[i]-1==numLog[i-1]:
            answer.append('w')
        elif numLog[i]+1==numLog[i-1]:
            answer.append('s')
        elif numLog[i]-10==numLog[i-1]:
            answer.append('d')
        elif numLog[i]+10==numLog[i-1]:
            answer.append('a')
    return ''.join(answer)