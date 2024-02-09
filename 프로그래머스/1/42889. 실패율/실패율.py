def solution(N, stages):
    fail={}
    people=len(stages)
    for i in range(1,N+1):
        if people==0:
            fail[i]=0
        else:
            fail[i]=stages.count(i)/people
            people-=stages.count(i)
    return sorted(fail,key=lambda i:fail[i],reverse=True)