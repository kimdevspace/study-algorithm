from itertools import permutations
def prime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True
def solution(numbers):
    sosu=[]
    #num=[''.join(i) for i in numbers]
    for i in range(1,len(numbers)+1):
        for n in permutations(numbers,i):
            disc=int(''.join(list(n)))
            if disc>=2 and prime(disc):
                sosu.append(disc)
    return len(set(sosu))