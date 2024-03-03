from math import gcd
n=int(input())
arr=[]
arr1=[]
for i in range(n):
    tree=int(input())
    arr.append(tree)
for i in range(1,len(arr)):
    num=arr[i]-arr[i-1]
    arr1.append(num)
g=arr1[0]
for j in range(1,len(arr1)):
    g=gcd(g,arr1[j])
cnt=0
for a in arr1:
    cnt+=a//g-1
print(cnt)