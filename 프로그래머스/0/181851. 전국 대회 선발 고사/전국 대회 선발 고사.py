def solution(rank, attendance):
    a=sorted([i for i,b in zip(rank,attendance) if b==True])
    return rank.index(a[0])*10000+rank.index(a[1])*100+rank.index(a[2])