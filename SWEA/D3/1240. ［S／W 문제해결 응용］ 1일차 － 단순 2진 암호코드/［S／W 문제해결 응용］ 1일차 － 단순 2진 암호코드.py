dic={'0001101':0,'0011001':1,'0010011':2,'0111101':3,'0100011':4
     ,'0110001':5,'0101111':6,'0111011':7,'0110111':8,'0001011':9}
T=int(input())
for tc in range(1,T+1):
    N,M=map(int,input().split())
    arr=[list(input()) for _ in range(N)]
    tmp=[]

    for ar in arr: # 이진수의 맨 끝은 무조건 1이니깐, 역순취해서 암호 추출해주기
        ar_r=ar[::-1]
        for i in range(len(ar_r)):
            if ar_r[i]=='1':
                tmp=ar_r[i:i+56]
                break
    tmp=tmp[::-1] #다시 역순
    ans=[]
    #7자리씩 끊어서 숫자로 변경한 뒤 ans에 저장
    for i in range(0,len(tmp),7):
        ans.append(dic[''.join(tmp[i:i+7])])
    #홀수자리의 합 x 3 + 짝수자리의 합
    hol,zzak=0,0
    for i in range(len(ans)):
        if i%2==0:
            hol+=ans[i]
        elif i%2==1:
            zzak+=ans[i]
    result=sum(ans)

    if (hol*3+zzak)%10==0:
        print('#'+str(tc),result)
    else:
        print('#'+str(tc),0)