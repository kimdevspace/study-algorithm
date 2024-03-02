import sys
input=sys.stdin.readline
n=int(input())
n_list=list(map(int,input().split()))
n_list=set(n_list)
m=int(input())
m_list=list(map(int,input().split()))
for num in m_list:
    if num in n_list:
        print(1)
    else:
        print(0)