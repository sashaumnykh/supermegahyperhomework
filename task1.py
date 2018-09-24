a = map(int.split())
m = 0
i = len(a)-1
m = a[i]
for i in range(len(a)-1,0,-1):
    a[i] = a[i-1]
a[0] = m
print(a)



