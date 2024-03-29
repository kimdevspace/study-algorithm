def solution(files):
    answer = []
    for file in files:
        head,number,tail='','',''
        for i in range(len(files)):
            if file[i].isdigit():
                head=file[:i]
                number=file[i:]
                for j in range(len(number)):
                    if not number[j].isdigit():
                        tail=number[j:]
                        number=number[:j]
                        break
                answer.append([head,number,tail])
                break
    answer=sorted(answer,key=lambda x:(x[0].upper(),int(x[1])))
    return [''.join(a) for a in answer]