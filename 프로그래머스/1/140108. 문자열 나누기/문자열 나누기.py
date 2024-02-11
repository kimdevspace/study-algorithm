def solution(s):
    answer=same=differ=0
    for i in s:
        if same==differ:
            answer+=1
            k=i
        if k==i:
            same+=1
        else:
            differ+=1
    return answer