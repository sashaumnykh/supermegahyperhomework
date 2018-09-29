def calc(a, operation, b):

    if operation == '+':
        return int(a) + int(b)
    elif operation == '-':
        return int(a) - int(b)
    elif operation == '*':
        return int(a) * int(b)
    elif operation == '/':
        if int(b)==0:
            raise ZeroDivisionError("На ноль делить нельзя!!!")
        else:
            return int(a) / int(b)
    else:
        raise ValueError("Неизвестная операция")

test = list(input().split(" "))
print(calc(test[0],test[1],test[2]))
