n,m=map(int,input().split())
if n==0:
    print(0)
else:
    book=list(map(int,input().split()))
    cnt=0
    box=[]
    for b in book:
        if sum(box)+b>m:
            cnt+=1
            box=[]
        box.append(b)
    print(cnt+1)