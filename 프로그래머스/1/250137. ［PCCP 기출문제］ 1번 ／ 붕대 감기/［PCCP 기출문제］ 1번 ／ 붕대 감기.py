def solution(bandage, health, attacks):
    t,x,y=bandage
    maxtime=attacks[-1][0]
    attacks={i[0]:i[1] for i in attacks}
    hp=health
    time=0
    for i in range(maxtime+1):
        if i in attacks:
            hp-=attacks[i]
            time=0
            if hp<=0:
                return -1
            continue
        time+=1
        hp+=x
        if time==t:
            hp+=y
            time=0
        hp=min(health,hp)
    return hp