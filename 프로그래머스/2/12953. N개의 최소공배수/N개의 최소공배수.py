from math import gcd
def solution(arr):
    answer = arr[0]
    for num in arr:
        answer=answer*num//gcd(answer,num) # 최대공약수 = a x b // gcd(a,b)
    return answer