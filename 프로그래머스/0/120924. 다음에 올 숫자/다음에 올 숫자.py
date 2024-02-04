def solution(common):
    d=0
    r=0
    res=0
    if common[1]-common[0]==common[2]-common[1]:
        d=common[1]-common[0]
        res=common[0]+d*(len(common))
    else:
        r=common[1]/common[0]
        res=common[0]*(r**len(common))
    return res