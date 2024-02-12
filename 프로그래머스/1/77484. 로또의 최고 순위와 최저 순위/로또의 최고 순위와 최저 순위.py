def solution(lottos, win_nums):
    rank_dic={6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    same=0
    for i in lottos:
        for j in win_nums:
            if i==j:
                same+=1
    max_rank=rank_dic[same+lottos.count(0)]
    min_rank=rank_dic[same]
    return [max_rank,min_rank]