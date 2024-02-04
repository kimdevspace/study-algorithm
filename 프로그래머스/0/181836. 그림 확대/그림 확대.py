def solution(picture, k):
    answer = []
    for i in picture: #picture 조사
        char='' #picture 조사할 때마다 문자열 생성
        for j in i: # 문자열 원소의 문자 조사 (가로)
            char+=j*k #빈 문자열에 문자xk 값 곱해서 저장.
        for c in range(k): # k의 길이만큼  (세로)
            answer.append(char) #세로로 answer에 추가.
    return answer