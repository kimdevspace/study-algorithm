def solution(n, k):
    answer=0
    word=''
    while n:
        word=str(n%k)+word
        n//=k
    word=word.split('0')
    for w in word:
        if len(w)==0 or int(w)<2:
            continue
        sosu=True
        for i in range(2,int(int(w)**0.5)+1):
            if int(w)%i==0:
                sosu=False
                break
        if sosu:
            answer+=1
    return answer