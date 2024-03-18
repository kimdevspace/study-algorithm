t=int(input())
for _ in range(t):
    M=input()
    cnt=[0 for _ in range(26)]
    res='OK'
    flag=False
    for i in range(len(M)):
        if flag:
            flag=False
            continue
        cnt[ord(M[i])-65]+=1
        if cnt[ord(M[i])-65]==3:
            if i==len(M)-1 or M[i]!=M[i+1]:
                res='FAKE'
                break
            cnt[ord(M[i])-65]=0
            flag=True
    print(res)