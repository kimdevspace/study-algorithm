t=int(input())
for tc in range(1,t+1):
    n=list(input())
    com=['0']*len(n)
    ans=0
    for i in range(len(n)):
        if com[i]=='0' and com[i] != n[i]:
            for j in range(i,len(n)):
                com[j]='1'
            ans+=1
        elif com[i]=='1' and com[i] != n[i]:
            for j in range(i,len(n)):
                com[j]='0'
            ans+=1
    print('#'+str(tc),ans)