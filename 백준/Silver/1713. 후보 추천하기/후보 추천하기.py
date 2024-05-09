n=int(input())
people=int(input())
arr=list(map(int,input().split()))
picture=[]
cnt=[]
for a in arr:
    if a not in picture:
        if len(picture)>=n:
            idx=cnt.index(min(cnt))
            del picture[idx]
            del cnt[idx]
        picture.append(a)
        cnt.append(1)
    else:
        cnt[picture.index(a)]+=1
picture.sort()
print(*picture)