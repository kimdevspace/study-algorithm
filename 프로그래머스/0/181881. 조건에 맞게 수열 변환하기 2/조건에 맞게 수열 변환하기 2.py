def solution(arr):
    for k in range(len(arr)):
        current_state = arr.copy()
        for i in range(len(arr)):
            if arr[i]>=50 and arr[i]%2==0:
                arr[i] = arr[i] // 2
            elif arr[i]<50 and arr[i]%2==1:
                arr[i]=arr[i]*2+1

        if arr==current_state: 
            return k  