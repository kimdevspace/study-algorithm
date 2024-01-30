def solution(arr, queries):
    for i in range(len(arr)):
        for s,e,k in queries:
            if i>=s and i<=e and i%k==0:
                arr[i]+=1
    return arr