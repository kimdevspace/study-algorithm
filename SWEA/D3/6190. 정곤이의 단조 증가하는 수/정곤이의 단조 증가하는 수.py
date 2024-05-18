def check(num):
    str_num=str(num)
    for i in range(1,len(str_num)):
        if str_num[i-1]>str_num[i]:
            return False
    return True
T=int(input())
for tc in range(1,T+1):
    n=int(input())
    arr=list(map(int,input().split()))
    ans=-1
    tmp=[]
    for i in range(n):
        for j in range(i+1,n):
            tmp.append(arr[i]*arr[j])
    for tm in tmp:
        if check(tm):
            if tm>ans:
                ans=tm
        else:
            continue
    print('#'+str(tc),ans)