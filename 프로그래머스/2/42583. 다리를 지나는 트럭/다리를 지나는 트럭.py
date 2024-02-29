from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer=0
    cw=0
    b=deque([0]*bridge_length)
    tw=deque(truck_weights)
    while len(tw)>0:
        answer+=1
        cw-=b.popleft()
        if cw+tw[0]<=weight:
            cw+=tw[0]
            b.append(tw.popleft())
        else:
            b.append(0)
    answer+=bridge_length
    return answer