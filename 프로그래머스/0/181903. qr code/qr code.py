def solution(q, r, code):
    ans=''
    for idx,val in enumerate(code):
        if idx%q==r:
            ans+=val
    return ans