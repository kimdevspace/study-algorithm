def solution(record):
    answer = []
    dic={}
    for r in record:
        word=r.split()
        if word[0]=='Leave':
            continue
        dic[word[1]]=word[2]
    for r in record:
        word=r.split()
        if word[0]=='Enter':
            answer.append(dic[word[1]]+'님이 들어왔습니다.')
        elif word[0]=='Leave':
            answer.append(dic[word[1]]+'님이 나갔습니다.')
    return answer