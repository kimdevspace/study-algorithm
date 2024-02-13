def solution(s, skip, index):
    answer = ''
    alpha='abcdefghijklmnopqrstuvwxyz'
    for a in alpha:
        if a in skip:
            alpha=alpha.replace(a,'')
    for i in s:
        res=alpha[(alpha.index(i)+index)%len(alpha)]
        answer+=res
    return answer