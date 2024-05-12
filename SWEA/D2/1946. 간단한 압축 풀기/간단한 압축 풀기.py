t=int(input())
for tc in range(1,t+1):
    n=int(input())
    tmp=[]
    for _ in range(n):
        alpha,num=input().split()
        for _ in range(int(num)):
            tmp.append(alpha)
    print('#'+str(tc))
    for i in range(0,len(tmp),10):
        print(''.join(tmp[i:i+10]))