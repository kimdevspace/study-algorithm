import sys
import heapq as hq
input=sys.stdin.readline
num_list=[]
n=int(input())
for _ in range(n):
    x=int(input())
    if x==0:
        if num_list:
            print(hq.heappop(num_list)*-1)
        else:
            print(0)
    elif x!=0:
        hq.heappush(num_list,x*-1)