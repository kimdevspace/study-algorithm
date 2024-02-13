def solution(keymap, targets):
    answer = []
    dic={}
    for i in range(len(keymap)):
        for j in range(len(keymap[i])):
            char=keymap[i][j]
            if char not in dic:
                dic[char]=j+1
            else:
                dic[char]=min(dic[char],j+1)
    for target in targets:
        sum=0
        for t in target:
            if t in dic:
                sum+=dic[t]
            else:
                sum=-1
                break
        answer.append(sum)
    return answer