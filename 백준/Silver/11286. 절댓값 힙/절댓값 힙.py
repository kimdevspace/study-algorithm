import heapq as hq
import sys
input=sys.stdin.readline
n=int(input())
heap=[]
for _ in range(n):
    digit=int(input())
    if digit!=0:
        hq.heappush(heap,(abs(digit),digit))
    else:
        if not heap:
            print(0)
        else:
            print(hq.heappop(heap)[1])