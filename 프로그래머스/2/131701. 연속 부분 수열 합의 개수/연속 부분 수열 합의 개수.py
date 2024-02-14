def solution(elements):
    n=len(elements)
    dp=elements
    elements=2*elements
    answer=set(dp)
    for i in range(2,n):
        for j in range(n):
            dp[j]=dp[j]+elements[i+j-1]
            answer.add(dp[j])
    return len(answer)+1
    