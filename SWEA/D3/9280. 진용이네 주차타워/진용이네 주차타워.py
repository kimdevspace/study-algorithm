t=int(input())
for tc in range(1,t+1):
    n,m=map(int,input().split())
    R=[]
    W=[]
    for _ in range(n):
        R.append(int(input()))
    for _ in range(m):
        W.append(int(input()))

    parking=[0 for i in range(n)]
    wating=[]
    res=0
    for _ in range(2*m):
        car=int(input())
        if car>0:
            for i in range(n):
                if parking[i]==0:
                    parking[i]=car
                    res+=R[i]*W[car-1]
                    break
            else:
                wating.append(car)
        else:
            car=abs(car)
            for i in range(n):
                if parking[i]==car:
                    if wating:
                        car=wating.pop(0)
                        parking[i]=car
                        res+=R[i]*W[car-1]
                        break
                    else:
                        parking[i]=0
                        break
    print('#'+str(tc),res)
