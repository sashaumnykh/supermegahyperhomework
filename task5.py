line = str(input())
lenght_of_line = len(line)
counter = 0
for i in range (0, lenght_of_line//2):
    if line[i]==line[lenght_of_line-1-i]:
        continue
    else:
        counter = counter + 1
if counter==0:
    print("Строка является палиндромом")
else:
    print("Строка не является палиндромом")
