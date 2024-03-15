ulim=list(map(int,input().split()))
startlink=list(map(int,input().split()))
u_score=0
s_score=0
flag=False
for u,s in zip(ulim,startlink):
    u_score+=u
    if u_score>s_score:
        flag=True
    s_score+=s
if u_score<s_score and flag:
    print('Yes')
else:
    print('No')