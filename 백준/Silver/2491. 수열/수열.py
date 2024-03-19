n=int(input())
arr=list(map(int,input().split()))
if n==1:
    print(1)
else:
    def up(lst):
        cnt=float('-inf')
        res=0
        for i in range(1,len(lst)):
            if lst[i]>=lst[i-1]:
                res+=1
                cnt=max(cnt,res)
            else:
                res=0
        return cnt+1
    def down(lst):
        cnt=float('-inf')
        res=0
        for i in range(1,len(lst)):
            if lst[i]<=lst[i-1]:
                res+=1
                cnt=max(cnt,res)
            else:
                res=0
        return cnt+1
    print(max(up(arr),down(arr)))