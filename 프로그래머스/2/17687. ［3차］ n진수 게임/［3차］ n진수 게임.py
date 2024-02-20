def con(number,base):
    arr='0123456789ABCDEF'
    q,r=divmod(number,base)
    if q==0:
        return arr[r]
    else:
        return con(q,base)+arr[r]
def solution(n, t, m, p):
    answer = ''
    candidate=[]
    for i in range(t*m):
        conv=con(i,n)
        for c in conv:
            candidate.append(c)
    for i in range(p-1,t*m,m):
        answer+=candidate[i]
    return answer