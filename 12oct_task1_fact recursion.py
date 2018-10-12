def factorial(n):
    if n<0:
        raise RecursionError ("Нужно ввести неотрицательное число!")
    else:
        if n==0:
            return 1
        else:
            return n*factorial(n-1)

test = int(input())
print (factorial(test))