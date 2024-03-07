while True:
    num=int(input())
    if num==0:
        break
    if str(num)==str(num)[-1::-1]:
        print('yes')
    else:
        print('no')