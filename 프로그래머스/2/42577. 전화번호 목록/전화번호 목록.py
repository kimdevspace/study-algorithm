def solution(phone_book):
    dic={p:1 for p in phone_book}
    for num in phone_book:
        ans=''
        for n in num:
            ans+=n
            if ans in dic and ans!=num:
                return False
    return True