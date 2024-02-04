def solution(num, total):
    answer = []
    d=0 #(n-1)d d는 무조건 1이다.
    for i in range(1,num):
        d+=i
    start=(total-d)//num
    answer=[i for i in range(start,start+num)]
    return answer