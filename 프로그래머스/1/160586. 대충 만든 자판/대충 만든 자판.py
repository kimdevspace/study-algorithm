def solution(keymap, targets):
    answer = []
    d={}
    for i in range(len(keymap)):
        for j in range(len(keymap[i])):
            char=keymap[i][j]
            if char not in d:
                d[char]=j+1
            else:
                d[char]=min(d[char],j+1)
    for target in targets:
        sum=0
        for t in target:
            if t in d:
                sum+=d[t]
            else:
                sum=-1
                break
        answer.append(sum)
    return answer