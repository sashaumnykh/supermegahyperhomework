import time
from memory_profiler import profile
@profile
def factorial(n):
    if type(n)!= int:
        return "Нужно ввести целое число!"
    if n<0:
        raise RecursionError ("Нужно ввести неотрицательное число!")
    elif n==0:
        return 1
    else:
        return n*factorial(n-1)

start_time = time.time()
#factorial(5)
test = int(input())
print (factorial(test))
print(time.time() - start_time)
