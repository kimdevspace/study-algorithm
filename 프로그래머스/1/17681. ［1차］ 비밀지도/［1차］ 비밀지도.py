def solution(n, arr1, arr2):
    answer = []
    barr1=[]
    barr2=[]
    for i in range(n):
        barr1.append(bin(arr1[i])[2:])
        barr2.append(bin(arr2[i])[2:])
        barr1[i]=('0'*(n-len(barr1[i])))+barr1[i]
        barr2[i]=('0'*(n-len(barr2[i])))+barr2[i]
        tmp=''
        for j in range(n):
            if barr1[i][j]=='1' or barr2[i][j]=='1':
                tmp+='#'
            elif barr1[i][j]=='0' or barr2[i][j]=='0':
                tmp+=' '
        answer.append(tmp)
    return answer