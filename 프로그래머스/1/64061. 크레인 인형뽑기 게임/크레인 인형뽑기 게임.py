def solution(board, moves):
    answer = 0
    basket=[]
    for m in moves:
        for boa in board:
            if boa[m-1]>0:
                basket.append(boa[m-1])
                boa[m-1]=0
                break
        if len(basket)>=2 and basket[-1]==basket[-2]:
            answer+=2
            basket=basket[:-2]
    return answer