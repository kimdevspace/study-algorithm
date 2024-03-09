import sys
from collections import deque
input=sys.stdin.readline
T=int(input())
for _ in range(T):
    p2=input()
    arr_len=int(input())
    num=input().strip()
    arr=deque(num[1:-1].split(','))
    rev=0 #뒤집는 횟수 :짝수면 원래대로 홀수면 뒤집기
    flag=0 #예외처리를 위한 변수
    if arr_len==0:
        arr=[]      
    for p in p2:
        if p=='R':
            rev+=1
        if p=='D':
            if len(arr)<1:
                flag=1
                print('error')
                break
            else:
                if rev%2==0:
                    arr.popleft()
                else:
                    arr.pop()
    if flag==0:
        if rev%2==0:
            print('['+','.join(arr)+']')
        else:
            arr.reverse()
            print('['+','.join(arr)+']')