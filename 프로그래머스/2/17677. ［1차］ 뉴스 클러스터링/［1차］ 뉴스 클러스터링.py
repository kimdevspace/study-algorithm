from collections import Counter
def solution(str1, str2):
    c1=Counter([(str1[i]+str1[i+1]).lower() for i in range(len(str1)-1) if str1[i].isalpha() and str1[i+1].isalpha()])
    c2=Counter([(str2[i]+str2[i+1]).lower() for i in range(len(str2)-1) if str2[i].isalpha() and str2[i+1].isalpha()])
    inter=list((c1&c2).elements())
    union=list((c1|c2).elements())
    if len(inter)==0 and len(union)==0:
        return 65536
    return int(len(inter)/len(union)*65536)