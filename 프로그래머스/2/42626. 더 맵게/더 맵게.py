import heapq as hq
def solution(scoville, K):
    answer = 0
    hq.heapify(scoville)
    while scoville[0]<K:
        combine=hq.heappop(scoville)+hq.heappop(scoville)*2
        hq.heappush(scoville,combine)
        answer+=1
        if scoville[0]<K and len(scoville)==1:
            return -1
    return answer