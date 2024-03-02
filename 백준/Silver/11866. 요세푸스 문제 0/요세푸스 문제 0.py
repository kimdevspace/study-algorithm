import sys
input=sys.stdin.readline
n,k=map(int,input().split())
n_list=[i for i in range(1,n+1)]
answer=[]
num=0
for i in range(n):
    num+=k-1
    if num>=len(n_list):
        num%=len(n_list)
    answer.append(str(n_list.pop(num)))
print('<'+', '.join(answer)+'>')