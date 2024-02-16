from collections import Counter
def solution(s):
    answer = []
    num=s.replace('{','').replace('}','').split(',')
    countnum=Counter(num).most_common() #개수 최빈값 순서대로
    for i in countnum:
        answer.append(int(i[0]))
    return answer