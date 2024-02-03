def solution(rank, attendance):
    a=[]
    aa=[]
    for i,b in zip(rank,attendance):
        if b==True:
            a.append(i)
    a=sorted(a)
    for i in range(3):
        aa.append(a[i])
    answer=rank.index(aa[0])*10000+rank.index(aa[1])*100+rank.index(aa[2])
    return answer