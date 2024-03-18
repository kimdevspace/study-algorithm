def jh(lst,money):
    cnt=0 #주식의 개수
    for i in range(len(lst)):
        if lst[i]<=money:
            tmp=lst[i]
            while tmp<=money: # 주가가 현금보다 작을때만 반복
                # 몇주를 살수있는지
                cnt+=1
                money-=tmp
    return cnt*lst[-1]+money
def sm(lst,money):
    cnt=0 #주식의 개수
    buy=0 #매수
    sell=0 #매도
    stack=[]
    for i in range(len(lst)):
        if stack and lst[i]<stack[-1]:
            buy+=1
            if buy==3:
                tmp=lst[i]
                while tmp<=money:
                    cnt+=1
                    money-=tmp
                buy=1
        else:
            buy=0
        if stack and lst[i]>stack[-1]:
            sell+=1
            if sell==3:
                tp=lst[i]
                while money>0 and cnt>0:
                    cnt-=1
                    money-=tp
                sell=1
        else:
            sell=0
        stack.append(lst[i])
    return cnt*lst[-1]+money        
cash=int(input())
MD=list(map(int,input().split()))
if jh(MD,cash)>sm(MD,cash):
    print('BNP')
elif jh(MD,cash)<sm(MD,cash):
    print('TIMING')
else:
    print('SAMESAME')