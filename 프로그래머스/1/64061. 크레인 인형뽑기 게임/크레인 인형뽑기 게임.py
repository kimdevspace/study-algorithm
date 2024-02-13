def solution(board, moves):
    answer = 0
    basket=[]
    for m in moves:
        for b in board:
            if b[m-1]>0:
                basket.append(b[m-1])
                b[m-1]=0
                break
        if len(basket)>=2 and basket[-2]==basket[-1]:
            answer+=2
            basket=basket[:-2]
    return answer