t=int(input())
for tc in range(1,t+1):
    arr=[list(map(int,input().split())) for _ in range(9)]
    arr_t=list(zip(*arr))
    ans=1
    print('#'+str(tc),end=' ')
    for a in arr:
        garo=[]
        flag1=0
        for j in range(len(a)):
            if garo and a[j] in garo:
                ans=0
            garo.append(a[j])

    for at in arr_t:
        sero=[]
        for j in range(len(at)):
            if sero and at[j] in sero:
                ans=0
            sero.append(at[j])
    
    for i in range(0,len(arr),3):
        for j in range(0,len(arr),3):
            tmp=[]
            for x in range(i,i+3):
                for y in range(j,j+3):
                    if tmp and arr[x][y] in tmp:
                        ans=0
                    tmp.append(arr[x][y])
    print(ans)