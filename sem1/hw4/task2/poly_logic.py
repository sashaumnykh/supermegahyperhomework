def derivative(poly):
    poly = poly.replace(' ', '').replace('-', '+-')
    poly_copy = []
    poly_copy.append('')
    poly_copy = poly.split('+')
    last = poly_copy[-1]
    if last.count('x') == 0:
        poly_copy = poly_copy[:-1]
    index = str()
    new_poly = str()
    for q in range(1, len(poly_copy)):
        part = poly_copy[q]
        for i in range(0, len(part)):
            if part[i] == 'x':
                var_indexes = i
        for i in range(0, len(part)):
            if part[i] == '^':
                degree_indexes = i
            for i in range(0, len(part)):
                if (part[i] == '-') or (part[i] == '+'):
                    sign_indexes = i
        if part[0] != '-':
            for k in range(0, var_indexes):
                index = str(index) + str(part[k])
            index = int(index)
            new_indexes = index * int(part[degree_indexes + 1])
            new_degrees = (int(part[degree_indexes + 1]) - 1)
        elif part[0] == '-':
            for k in range(1, int(var_indexes)):
                index = str(index) + str(part[k])
            new_indexes = (-1) * int(index) * int(part[degree_indexes + 1])
            new_degrees = int(part[degree_indexes + 1]) - 1
        if new_indexes > 0:
            new_poly += '+'
        new_poly += str(new_indexes)
        new_poly += 'x^'
        new_poly += str(new_degrees)
        index = ''
        degree_indexes = ''
    return new_poly

