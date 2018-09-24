n = int(input())
minus_n=-1*n
minimum = min (n, minus_n)
maximum = max (n, minus_n)
summ_of_devisors=0
for i in range (minimum, maximum+1):
    if i==0:
        continue
    if n%i==0:
        summ_of_devisors=summ_of_devisors+1
if summ_of_devisors==4:
    print("Число является простым")
else:
    print("Число не является простым")
