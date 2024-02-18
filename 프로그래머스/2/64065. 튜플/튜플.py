from collections import Counter
def solution(s):
    answer=[]
    s=s.replace('{','').replace('}','').split(',')
    countnum=Counter(s).most_common()
    for c in countnum:
        answer.append(int(c[0]))
    return answer