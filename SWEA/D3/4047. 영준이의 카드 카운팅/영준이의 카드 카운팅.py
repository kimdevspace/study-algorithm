t=int(input())
for tc in range(1,t+1):
    string=input()

    arr=[]
    for i in range(len(string)):
        if string[i] in ['S','D','H','C']:
            arr.append(string[i:i+3])

    Sl=[0]*14
    Dl=[0]*14
    Hl=[0]*14
    Cl=[0]*14

    ans=''
    for a in arr:
        tmp=0
        for i in range(len(a)):
            if a[i]=='S':
                tmp=int(a[i+1])*10+int(a[i+2])*1
                if Sl[tmp]==0:
                    Sl[tmp]+=1
                else:
                    ans='ERROR'
                    break
            if a[i]=='D':
                tmp = int(a[i + 1]) * 10 + int(a[i + 2]) * 1
                if Dl[tmp] == 0:
                    Dl[tmp] += 1
                else:
                    ans='ERROR'
                    break
            if a[i]=='H':
                tmp = int(a[i + 1]) * 10 + int(a[i + 2]) * 1
                if Hl[tmp] == 0:
                    Hl[tmp] += 1
                else:
                    ans='ERROR'
                    break
            if a[i]=='C':
                tmp = int(a[i + 1]) * 10 + int(a[i + 2]) * 1
                if Cl[tmp] == 0:
                    Cl[tmp] += 1
                else:
                    ans='ERROR'
                    break
    print('#'+str(tc),end=' ')
    if ans=='ERROR':
        print(ans)
    else:
        print(Sl.count(0)-1,Dl.count(0)-1,Hl.count(0)-1,Cl.count(0)-1)