arr='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'
t=int(input())
for tc in range(1,t+1):
    base64=input()
    ans=''
    for b in base64:
        idx=arr.index(b)
        ans+='0'*(6-len(bin(idx)[2:]))+str(bin(idx)[2:])
    print('#'+str(tc),end=' ')
    for i in range(0,len(ans),8):
        print(chr(int(ans[i:i+8],2)),end='')
    print()  