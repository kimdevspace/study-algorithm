t=int(input())
def count(arr):
    res=0
    for a in arr:
        cnt=0
        for j in range(len(a)):
            if a[j]:
                cnt+=1
            else:
                if cnt==k:
                    res+=1
                cnt=0
    return res
for tc in range(1,t+1):
    n,k=map(int,input().split())
    arr=[list(map(int,input().split()))+[0] for _ in range(n)]+[[0]*(n+1)]
    arr_t=list(zip(*arr))
    print('#'+str(tc),count(arr)+count(arr_t))