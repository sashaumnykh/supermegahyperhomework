def calc():
    a = float(input())
    operation = str(input())
    b = float(input())
    if operation!='+' or operation!='-' or operation!='/' or operation!="*":
        return "Неизвестная операция"
    if operation=='+' or operation=='-' or operation=='*' or operation=='/':
        if operation=='+':
            return a+b
        elif operation=='-':
            return a-b
        elif operation=='*':
            return a*b
        elif operation=='/' and b!=0:
            return a/b
                   #разберись с вводом операций и их распознаванием!!
