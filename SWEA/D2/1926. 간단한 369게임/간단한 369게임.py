n=int(input())
for i in range(1,n+1):
    clap=0
    for j in str(i):
        if j in ['3','6','9']:
            clap+=1
    if clap==0:
        print(i,end=' ')
    else:
        print('-'*clap,end=' ')