def solution(numbers):
    answer = []
    for num in numbers:
        if num%2==1:
            number='0'+bin(num)[2:]
            number=number[:number.rindex('0')]+'10'+number[number.rindex('0')+2:]
            answer.append(int(number,2))
        else:
            answer.append(num+1)
    return answer