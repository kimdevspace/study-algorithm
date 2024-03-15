alpha=[3,2,1,2,3,3,2,3,3,2,2,1,2,2,1,2,2,2,1,2,1,1,1,2,2,1]
A=input()
B=input()
arr=[]
for i in range(len(A)):
    arr.append(alpha[ord(A[i])-65])
    arr.append(alpha[ord(B[i])-65])
tmp=[]
while len(arr)!=2:
    for idx in range(1,len(arr)):
        tmp.append((arr[idx]+arr[idx-1])%10)
    arr=tmp
    tmp=[]
print(*arr,sep='')