for tc in range(1,11):
    n=int(input()) # 암호문의 길이
    code=list(map(int,input().split())) #원본 암호문
    com_len=int(input()) #명령어의 개수
    com=list(input().split()) #명령어

    tmp=[]
    for i in range(len(com)):
        if com[i]=='I':
            tmp.append(com[i:i+3+int(com[i+2])])
        elif com[i]=='D':
            tmp.append(com[i:i+3])

    for t in tmp:
        for i in range(len(t)):
            if t[i]=='I':
                idx=3
                for j in range(int(t[1]),int(t[1])+int(t[2])):
                    code.insert(j,t[idx])
                    idx+=1
            elif t[i]=='D':
                for j in range(int(t[1]),int(t[1])+int(t[2])):
                    del code[int(t[1])]
    print('#'+str(tc),*code[:10])