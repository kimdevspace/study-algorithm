def solution(n):
    count=bin(n).count('1')
    while n:
        n+=1
        if bin(n).count('1')==count:
            break
    return n