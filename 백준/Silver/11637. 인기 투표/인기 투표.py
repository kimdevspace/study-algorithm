T=int(input())
for _ in range(T):
    n=int(input()) #후보자 수
    score=[] #득표 수
    for i in range(n):
        score.append(int(input()))
    if max(score)>sum(score)-max(score):
        print('majority winner',score.index(max(score))+1)
    elif max(score)<=sum(score)-max(score) and score.count(max(score))<2:
        print('minority winner',score.index(max(score))+1)
    else:
        print('no winner')