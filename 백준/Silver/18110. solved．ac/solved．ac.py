import sys
input=sys.stdin.readline
def round1(num):
    return int(num)+(1 if num-int(num)>=0.5 else 0)
n=int(input())
if not n:
    print(0)
else:
    tier=[int(input()) for _ in range(n)]
    cut_num=round1(n*0.15)
    cut_tier=sorted(tier)[cut_num:n-cut_num]
    avg=round1(sum(cut_tier)/len(cut_tier))
    print(avg)