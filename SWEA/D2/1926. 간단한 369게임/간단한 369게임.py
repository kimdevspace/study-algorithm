n=int(input())
for i in range(1,n+1):
    cnt=0 #박수횟수
    for j in str(i):
        if j in ['3','6','9']:
            cnt+=1
    if cnt==0:
        print(i,end=' ')
    else:
        print('-'*cnt,end=' ')