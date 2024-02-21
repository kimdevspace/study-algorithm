from itertools import product
def solution(word):
    words=[]
    for i in range(1,6):
        for pro in product(['A','E','I','O','U'],repeat=i):
            words.append(''.join(list(pro)))
    words.sort()
    return words.index(word)+1