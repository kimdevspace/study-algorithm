from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    cw=0
    tw=deque(truck_weights)
    bridge=deque([0]*bridge_length)
    while len(tw)>0:
        answer+=1
        cw-=bridge.popleft()
        if cw+tw[0]<=weight:
            cw+=tw[0]
            bridge.append(tw.popleft())
        else:
            bridge.append(0)
    answer+=bridge_length
    return answer