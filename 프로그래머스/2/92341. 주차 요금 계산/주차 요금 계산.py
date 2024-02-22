from math import ceil
def h2m(time):
    h,m=map(int,time.split(':'))
    return h*60+m
def solution(fees, records):
    answer = []
    parking={}
    res={}
    for r in records:
        time,num,io=r.split()
        if io=='IN':
            parking[num]=h2m(time)
            if num not in res:
                res[num]=0
        else:
            res[num]+=h2m(time)-parking[num]
            del parking[num]
    for k,v in parking.items():
        res[k]+=23*60+59-v
    for k,v in sorted(res.items()):
        if v<=fees[0]:
            answer.append(fees[1])
        else:
            answer.append(fees[1]+ceil((v-fees[0])/fees[2])*fees[3])
    return answer