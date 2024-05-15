for tc in range(1,11):
    N=int(input())
    arr=list(map(int,input().split()))
    com_cnt=int(input())
    command=list(input().split())

    insert_v=[]
    for i in range(len(command)):
        tmp=[]
        if command[i]=='I':
            tmp=command[i:i+3+int(command[i+2])]
            insert_v.append(tmp)


    for ins in insert_v:
        idx=3
        for i in range(int(ins[1]),int(ins[1])+int(ins[2])):
            arr.insert(i,int(ins[idx]))
            idx+=1
    print('#'+str(tc),*arr[:10])