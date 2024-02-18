def solution(progresses, speeds):
    answer = []
    d=0
    c=0
    while len(progresses)>0:
        if progresses[0]+d*speeds[0]>=100:
            progresses.pop(0)
            speeds.pop(0)
            c+=1
        else:
            if c>0:
                answer.append(c)
                c=0
            d+=1
    answer.append(c)
    return answer