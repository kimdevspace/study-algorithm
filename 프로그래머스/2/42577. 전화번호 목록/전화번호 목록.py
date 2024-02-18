def solution(phone_book):
    call={i:1 for i in phone_book}
    for phone in phone_book:
        ans=''
        for p in phone:
            ans+=p
            if ans in call and ans!=phone:
                return False
    return True