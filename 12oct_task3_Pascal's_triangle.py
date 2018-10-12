from math import factorial
def pascal(n):
    a=list()
    for i in range(n):
        a.append(list())
        for j in range (i+1):
            a[i].append(int(factorial(i)/factorial(j)/factorial(i-j)))
    return a

n = int(input())
z = pascal(n)
for i in range (n):
    print (z[i])
