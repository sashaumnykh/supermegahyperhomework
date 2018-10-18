n = int(input())
minus_n= -1 * n
minimum = min(n, minus_n)
maximum = max(n, minus_n)
for i in range (minimum, maximum+1):
    if i==0:
        continue
    if n%i==0:
        print (i)
