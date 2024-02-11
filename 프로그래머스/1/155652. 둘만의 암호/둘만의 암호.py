def solution(s, skip, index):
    answer = ''
    al='abcdefghijklmnopqrstuvwxyz'
    for i in al:
        if i in skip:
            al=al.replace(i,'')
    for i in s:
        res=al[(al.index(i)+index)%len(al)]
        answer+=res
    return answer