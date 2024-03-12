A,B=map(int,input().split())
m=int(input())
A_num=list(map(int,input().split()))
A_num.reverse() # 첫째자리부터 계산.
decimal=0
conversion=[]
#10진수로 변환
for i in range(m):
    decimal+=A_num[i]*(A**i)
while decimal//B:
    conversion.append(decimal%B)
    decimal//=B
conversion.append(decimal)
conversion.reverse()
print(*conversion)