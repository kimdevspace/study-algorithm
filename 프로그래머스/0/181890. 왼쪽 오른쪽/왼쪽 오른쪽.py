def solution(str_list):
    for i in range(len(str_list)):
        if str_list[i]=='l':
            return str_list[:str_list.index('l')]
        elif str_list[i]=='r':
            return str_list[str_list.index('r')+1:]
    return []