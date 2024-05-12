t=int(input())
for tc in range(1,t+1):
    number=int(input())
    arr=[0,0,0,0,0,0,0,0,0,0]
    i=1
    while arr.count(0)!=0:
        check_number=number*i
        for n in str(check_number):
            arr[int(n)]=1
        i+=1
    print('#'+str(tc),check_number)