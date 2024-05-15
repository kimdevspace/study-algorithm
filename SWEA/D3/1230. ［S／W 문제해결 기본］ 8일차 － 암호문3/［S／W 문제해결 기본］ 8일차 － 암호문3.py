for tc in range(1,11):
    N=int(input())
    code=list(map(int,input().split()))
    M=int(input())
    process=list(input().split())
    tmp=[]
    for i in range(len(process)):
        if process[i]=='I':
            tmp.append(process[i:i+2+int(process[i+2])+1])
        elif process[i]=='D':
            tmp.append(process[i:i+3])
        elif process[i]=='A':
            tmp.append(process[i:i+1+int(process[i+1])+1])

    for tm in tmp:
        for i in range(len(tm)):
            if tm[i]=='I':
                idx=3
                for j in range(int(tm[1]),int(tm[1])+int(tm[2])):
                    code.insert(j,int(tm[idx]))
                    idx+=1
            elif tm[i]=='D':
                for j in range(int(tm[1]),int(tm[1])+int(tm[2])):
                    del code[j]
            elif tm[i]=='A':
                idx=2
                for j in range(int(tm[1])):
                    code.append(int(tm[idx]))
                    idx+=1
    print('#'+str(tc),*code[:10])