sw=int(input())
state=list(map(int,input().split()))
stu=int(input())
for _ in range(stu):
    sex,num=map(int,input().split())
    if sex==1:
        for i in range(num-1,sw,num):
            if state[i]==0:
                state[i]=1
            elif state[i]==1:
                state[i]=0
    elif sex==2:
        left=(num-1)-1
        right=(num-1)+1
        if state[num-1]==0:
            state[num-1]=1
        elif state[num-1]==1:
            state[num-1]=0
        while left>=0 and right<sw and state[left]==state[right]:
            if state[left]==state[right]==0:
                state[left]=state[right]=1
                left-=1
                right+=1
            elif state[left]==state[right]==1:
                state[left]=state[right]=0
                left-=1
                right+=1
for i in range(1,sw+1):
    print(state[i-1],end=' ')
    if i%20==0:
        print()