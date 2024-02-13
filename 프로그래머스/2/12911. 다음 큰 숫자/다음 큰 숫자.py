def solution(n):
    count=str(bin(n)[2:]).count('1')
    while n:
        n+=1
        if str(bin(n)[2:]).count('1')==count:
            break
    return n