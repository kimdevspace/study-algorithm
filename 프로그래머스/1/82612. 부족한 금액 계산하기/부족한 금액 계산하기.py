def solution(price, money, count):
    answer=0
    for i in range(price,price*count+1,price):
        answer+=i
    if answer<=money:
        return 0
    else:
        return answer-money