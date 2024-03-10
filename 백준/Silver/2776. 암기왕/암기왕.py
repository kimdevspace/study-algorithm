import sys
input=sys.stdin.readline
def bs(start,end,lst,n):
    while start<=end:
        mid=(start+end)//2
        if lst[mid]==n:
            return 1
        elif lst[mid]<n:
            start=mid+1
        else:
            end=mid-1
    return 0
t=int(input())
for _ in range(t):
    n=int(input())
    num1=list(map(int,input().split()))
    #이분탐색은 오름차순 또는 내림차순으로 정렬된 배열에 적용 가능한 탐색기법.
    num1.sort()
    m=int(input())
    num2=list(map(int,input().split()))
    for num in num2:
        print(bs(0,n-1,num1,num))