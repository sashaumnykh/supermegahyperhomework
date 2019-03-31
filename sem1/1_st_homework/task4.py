n = int(input())
minus_n=-1*n
minimum = min (n, minus_n)
maximum = max (n, minus_n)
number_of_devisors=0
for i in range (minimum, maximum+1):
    if i==0:
        continue
    if n%i==0:
        number_of_devisors=number_of_devisors+1
if number_of_devisors==4:
    print("Число является простым")
else:
    print("Число не является простым")
