def solution(arr1, arr2):
    answer = [[0 for i in range(len(arr2[0]))] for i in range(len(arr1))]
    #N,M M,K -> n,k,m 순 for문
    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            for k in range(len(arr1[0])):
                answer[i][j]+=arr1[i][k]*arr2[k][j]
    return answer