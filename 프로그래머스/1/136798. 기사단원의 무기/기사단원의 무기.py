def divisor(n):
    divisorlist=[]
    for i in range(1,int(n**(0.5)+1)):
        if n%i==0:
            divisorlist.append(i)
            if i**2!=n:
                divisorlist.append(n//i)
    return len(divisorlist)
def solution(number, limit, power):
    answer = 0
    for i in range(1,number+1):
        price=divisor(i)
        if price>limit:
            price=power
        answer+=price
    return answer