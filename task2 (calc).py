def calc(a, operation, b):
    try:
        if operation == '+':
            return int(a) + int(b)
        elif operation == '-':
            return int(a) - int(b)
        elif operation == '*':
            return int(a) * int(b)
        elif operation == '/' and int(b)!=0:
            return int(a) / int(b)
        else:
            return "Неизвестная операция"
    except:
        return "Неизвестная операция"

test = list(input().split(" "))
print(calc(test[0],test[1],test[2]))