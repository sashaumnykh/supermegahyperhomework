import time
import unittest
from memory_profiler import profile
@profile
def factorial(n):
    if type(n)!= int:
        return "Нужно ввести целое число!"
    if n<0:
        raise RecursionError ("Нужно ввести неотрицательное число!")
    elif n==0:
        return 1
    else:
        return n*factorial(n-1)

start_time = time.time()
#factorial(5)
test = int(input())
print (factorial(test))
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
    
