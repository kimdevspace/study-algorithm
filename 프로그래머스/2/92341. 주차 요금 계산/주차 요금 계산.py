
from math import ceil
def htom(time):
    h,m=map(int,time.split(':'))
    return h*60+m
def solution(fees, records):
    answer = []
    park={}
    res={}
    for r in records:
        time,num,io=r.split()
        if io=='IN':
            park[num]=htom(time)
            if num not in res:
                res[num]=0
        else:
            res[num]+=htom(time)-park[num]
            del park[num]
    for k,v in park.items():
        res[k]+=23*60+59-v
    for k,v in sorted(res.items()):
        if v<=fees[0]:
            answer.append(fees[1])
        else:
            answer.append(fees[1]+ceil((v-fees[0])/fees[2])*fees[3])
    return answer