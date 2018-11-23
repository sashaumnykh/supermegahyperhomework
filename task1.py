import random

chance = float(input("Введите вероятность(проценты): "))
one_test_time = int(input("Введите время одного теста(минуты): "))
all_work_time = int(input("Введите время всей проверки(минуты): "))
tests_number = int(input("Введите количество симуляций: "))
prob_with_K = float()
for i in range(tests_number):
    for j in range(int(all_work_time / one_test_time)):
        if random.random() < (chance / 100):
            print("L", end="")
            break
    else:
        if random.random() < (chance / 100):
            print("S", end="")
            prob_with_K += 1 / tests_number
        else:
            print("F", end="")
print()
print("Шансы Инокентия встретить Константина: ", prob_with_K)
