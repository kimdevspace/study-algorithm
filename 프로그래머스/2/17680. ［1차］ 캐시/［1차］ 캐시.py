from collections import deque
def solution(cacheSize, cities):
    answer = 0
    deq=deque()
    if cacheSize==0:
        return len(cities)*5
    else:
        for city in cities:
            city=city.upper()
            if city in deq:
                answer+=1
            else:
                answer+=5
            if city in deq:
                deq.remove(city)
            else:
                if len(deq)>=cacheSize:
                    deq.popleft()
            deq.append(city)
    return answer