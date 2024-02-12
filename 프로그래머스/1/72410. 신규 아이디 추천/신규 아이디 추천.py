def solution(new_id):
    answer = ''
    new_id=new_id.lower()#1
    for i in new_id:#2
        if i.isalnum() or i in '-_.':
            answer+=i
    while '..' in answer:#3
        answer=answer.replace('..','.')
    answer=answer[1:] if answer[0]=='.' and len(answer)>1 else answer
    answer=answer[:-1] if answer[-1]=='.' else answer
    answer='a' if len(answer)==0 else answer#5
    if len(answer)>=16:#6
        answer=answer[:15]
        if answer[-1]=='.':
            answer=answer[:-1]
    if len(answer)<=2:#7
        answer=answer+answer[-1]*(3-len(answer))
    return answer