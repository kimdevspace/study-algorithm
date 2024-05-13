t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    arr=[]
    ans1=0
    ans2=0
    for _ in range(n):
        word=input()
        arr.append(word)
    for a in arr: 
        if a==a[::-1]: #자기자신이 팰린드롬이면
            ans1=m
        elif a!=a[::-1] and a[::-1] in arr: #팰린드롬이 아니고, 원소를 역순으로 했을때 그 원소가 존재한다면
            ans2+=m
    print('#'+str(tc),ans1+ans2)