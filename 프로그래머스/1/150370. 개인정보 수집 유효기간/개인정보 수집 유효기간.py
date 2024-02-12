def solution(today, terms, privacies):
    answer = []
    dic={}
    today_list=list(map(int,today.split('.')))
    for term in terms:
        t,p=term.split()
        dic[t]=int(p)*28
    for i in range(len(privacies)):
        date,s=privacies[i].split()
        date_list=list(map(int,date.split('.')))
        year=(today_list[0]-date_list[0])*336
        month=(today_list[1]-date_list[1])*28
        day=today_list[2]-date_list[2]
        total=year+month+day
        if dic[s]<=total:
            answer.append(i+1)
    return answer