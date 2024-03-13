k=int(input())
for i in range(k):
    arr1=list(map(int,input().split()))
    arr=sorted(arr1[1:])
    gap=min([arr[i]-arr[i+1] for i in range(len(arr)-1)])
    print('Class',i+1)
    print('Max'+' '+str(max(arr))+','+' '+'Min'+' '+str(min(arr))+','+' '+'Largest gap'+' '+str(-gap))