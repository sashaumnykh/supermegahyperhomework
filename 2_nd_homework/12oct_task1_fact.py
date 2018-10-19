import unittest
import time
from memory_profiler import profile
@profile
def factorial(n):
    fact = 1
    if type(n)!=int:
        return "n должно быть целым числом"
    elif n==0:
        return 1
    elif n<0:
        return "n не может быть меньше 0"
    else:
        for i in range (1, n+1):
            fact=fact*i
        return fact
print(factorial(5000))

start_time = time.time()
#factorial(5)
#test = int(input())
#print (factorial(test))
print(time.time() - start_time)

class factorial_test(unittest.TestCase):
    def test_5(self):
        self.assertEqual(factorial(5),120)
    def test_0(self):
        self.assertEqual(factorial(0),1)
    def test_values2(self):
        self.assertEqual(factorial(3),6)


if __name__ == "__main__":
    unittest.main()
