def solution(lottos, win_nums):
    d={6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    same=[]
    for i in lottos:
        for j in win_nums:
            if i==j:
                same.append(i)
    max_rank=d[len(same)+lottos.count(0)]
    min_rank=d[len(same)]
    return [max_rank,min_rank]