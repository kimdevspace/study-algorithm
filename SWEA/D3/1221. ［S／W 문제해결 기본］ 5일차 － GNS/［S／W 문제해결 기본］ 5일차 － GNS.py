dic1={'ZRO':0,'ONE':1,'TWO':2,'THR':3,'FOR':4,'FIV':5,'SIX':6,'SVN':7,'EGT':8,'NIN':9}
dic2={0:'ZRO',1:'ONE',2:'TWO',3:'THR',4:'FOR',5:'FIV',6:'SIX',7:'SVN',8:'EGT',9:'NIN'}
t=int(input())
for tc in range(1,t+1):
    num, n = input().split()
    lst=list(map(str,input().split()))
    ans=[]
    for l in lst:
        ans.append(dic1[l])
    ans.sort()
    print(num,end=' ')
    for a in ans:
        print(dic2[a],end=' ')