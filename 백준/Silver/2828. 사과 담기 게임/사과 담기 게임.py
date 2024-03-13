n,m=map(int,input().split())
apple=int(input())
left,right=1,m
cnt=0
for _ in range(apple):
    drop=int(input())
    if left<=drop and right>=drop:
        continue
    elif left>drop:
        cnt+=(left-drop)
        right-=(left-drop)
        left=drop
    else:
        cnt+=(drop-right)
        left+=(drop-right)
        right=drop
print(cnt)