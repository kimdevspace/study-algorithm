for tc in range(1,11):
    n=int(input())
    arr=list(map(int,input().split()))
    ans=0
    for i in range(2,len(arr)-2):
        tmp=arr[i-2:i+1]+arr[i+1:i+3]
        if tmp[2]==max(tmp):
            tmp_s=sorted(tmp)
            ans+=tmp_s[-1]-tmp_s[-2]
    print('#'+str(tc),ans)