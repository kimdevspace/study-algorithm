from math import ceil
def htom(time):
    h,m=map(int,time.split(':'))
    return h*60+m
def solution(fees, records):
    answer = []
    par={}
    res={}
    for r in records:
        time,num,io=r.split()
        if io=='IN':
            par[num]=htom(time)
            if num not in res:
                res[num]=0
        else:
            res[num]+=htom(time)-par[num]
            del par[num]
    for k,v in par.items():
        res[k]+=23*60+59-v
    for k,v in sorted(res.items()):
        if v<=fees[0]:
            answer.append(fees[1])
        else:
            answer.append(fees[1]+ceil((v-fees[0])/fees[2])*fees[3])
    return answer