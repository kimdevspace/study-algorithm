def solution(brown, yellow):
    ab=brown+yellow
    for b in range(1,ab+1):
        if (ab/b)%1==0:
            a=ab/b
            if a>=b:
                if (a*2+b*2)-4==brown:
                    return [a,b]