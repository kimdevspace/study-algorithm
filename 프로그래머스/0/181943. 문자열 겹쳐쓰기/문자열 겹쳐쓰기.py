def solution(my_string, overwrite_string, s):
    m=list(my_string)
    o=list(overwrite_string)
    m[s:s+len(o)]=o
    return ''.join(m)