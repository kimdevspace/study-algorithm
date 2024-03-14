def b_sort(lst):
    cnt=0
    for i in range(len(lst)-1,0,-1):
        for j in range(i):
            if lst[j]>lst[j+1]:
                lst[j],lst[j+1]=lst[j+1],lst[j]
                cnt+=1
    return cnt
P=int(input())
for _ in range(P):
    height=list(map(int,input().split()))
    lst=height[1:]
    print(height[0],b_sort(lst))