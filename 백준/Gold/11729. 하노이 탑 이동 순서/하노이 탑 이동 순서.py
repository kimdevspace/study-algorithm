def hanoi(n,start,end,other):
    if n==1:
        print(start,end)
        return
    hanoi(n-1,start,other,end)
    print(start,end)
    hanoi(n-1,other,end,start)
n=int(input())
print(2**n-1)
hanoi(n,1,3,2) #원반 갯수, 시작기둥, 목표기둥, 보조기둥