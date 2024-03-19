A,P=map(int,input().split())
arr=[A]
com=0
while True:
    tmp=0
    for j in range(len(str(arr[-1]))):
        tmp+=int(str(arr[-1])[j])**P
    if tmp in arr:
        break
    arr.append(tmp)
for i in range(len(str(arr[-1]))):
    com+=int(str(arr[-1])[i])**P
print(arr.index(com))