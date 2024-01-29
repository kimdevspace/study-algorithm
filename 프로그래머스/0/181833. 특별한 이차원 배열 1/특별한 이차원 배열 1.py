def solution(n):
    answer = [[0]*n for i in range(n)]
    for i in range(len(answer)):
        answer[i][i]=1
    return answer