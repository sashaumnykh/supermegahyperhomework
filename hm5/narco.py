from narco_classes import Narc1, Narc2

T1 = int(input("Введите время наполнения шприца: "))
T2 = int(input("Введите время передачи шприца: "))
T3 = int(input("Введите время наполнения вены: "))
t = int(input("Введите время рекриации: "))
summary = int()
k = int()
buf = int()
n1 = Narc1()
n1.K = T1 + 1
n1.set_dose()
n2 = Narc2()
n2.wait()
for i in range(t):
    buf += 1
    if n1.K > 1:
        n1.K -= 1
    else:
        if n1.condition == 'N':
            n1.transfer()
            n1.K = T2
        elif n1.condition == 'p':
            n1.wait()
    if n2.K > 1:
        n2.K -= 1
    else:
        if n2.condition == 'I':
            n2.wait()
        if n2.condition == '.' and n1.condition == '.':
            n2.inject()
            n2.K = T3
            n1.set_dose()
            n1.K = T1
            summary += buf
            k += 1
            buf = 0
    print(n1.condition + "  " + n2.condition)
print(summary / k)
