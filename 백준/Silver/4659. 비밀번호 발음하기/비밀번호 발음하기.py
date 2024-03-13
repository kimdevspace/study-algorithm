lst=['a','e','i','o','u']
def mo(pw):
    for i in range(len(pw)):
        if pw[i] in lst:
            return True
    return False
def mo2(pw):
    for i in range(len(pw)):
        if i>0:
            if pw[i]==pw[i-1]:
                if pw[i]!='e' and pw[i]!='o':
                    return False
    return True
def mo3(pw):
    cnt1=0
    cnt2=0
    for i in range(len(pw)):
        if pw[i] in lst:
            cnt1+=1
            cnt2=0
            if cnt1==3:
                return False
        else:
            cnt2+=1
            cnt1=0
            if cnt2==3:
                return False
    return True
while True:
    pw=input()
    if pw=='end':
        break
    else:
        if mo2(pw) and mo(pw) and mo3(pw):
            print('<'+pw+'> is acceptable.')
        else:
            print('<'+pw+'> is not acceptable.')