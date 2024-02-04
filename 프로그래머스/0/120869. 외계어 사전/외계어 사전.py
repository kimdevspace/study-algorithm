def solution(spell, dic):
    for d in dic:
        if not set(spell)-set(d):# spell문자열과 d문자열간 차집합이 비어있으면(두 문자열에 중복된 문자가 없으면) 참
            return 1
    return 2