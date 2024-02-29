from collections import deque
def solution(x, y, n):
    edge=[0]*(y+1)
    q=deque([x])
    while q:
        tmp=q.popleft()
        if tmp==y:
            return edge[tmp]
        for num in [tmp+n,tmp*2,tmp*3]:
            if num<=y and not edge[num]:
                q.append(num)
                edge[num]=edge[tmp]+1
    return -1