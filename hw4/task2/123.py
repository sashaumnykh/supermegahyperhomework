part = '27x^1'
index = ''
new_poly = ''
for i in range(0, len(part)):
    if part[i] == 'x':
        var_indexes = i
for i in range(0, len(part)):
    if part[i] == '^':
        degree_indexes = i
    for i in range(0, len(part)):
        if (part[i] == '-') or (part[i] == '+'):
            sign_indexes = i
if (part[0] != '+') and (part[0] != '-'):
    for k in range(0, var_indexes):
        index = str(index) + str(part[k])
    index = int(index)
    print(index)
    new_indexes = index * int(part[degree_indexes + 1])
    print(new_indexes)
    new_degrees = (int(part[degree_indexes + 1]) - 1)
    print(new_degrees)
new_poly += str(new_indexes)
new_poly += 'x^'
new_poly += str(new_degrees)
print(new_poly)
