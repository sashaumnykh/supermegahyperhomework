import time
import unittest
from memory_profiler import profile
@profile
def factorial(n):
    if type(n)!= int:
        raise TypeError ("Аргумент должен быть целым числом!")
    elif n<0:
        raise ValueError ("Аргумент должен быть неотрицательным целым числом!")
    elif n==0:
        return 1
    else:
        return n*factorial(n-1)

start_time = time.time()
factorial(5)
#test = input()
#print (factorial(test))
print(time.time() - start_time)

class factorial_test(unittest.TestCase):
    def test_5(self):
        self.assertEqual(factorial(5),120)
    def test_1(self):
        self.assertEqual(factorial(1), 1)
    def test_12(self):
        self.assertEqual(factorial(12), 479001600)
    def test_0(self):
        self.assertEqual(factorial(0),1)
    def test_3(self):
        self.assertEqual(factorial(3),6)
    def test_falsetype_str1(self):
        self.assertRaises(TypeError, factorial, 'oooo')
    def test_falsetype_str2(self):
        self.assertRaises(TypeError, factorial, ' ')
    def test_falsetype_negative(self):
        self.assertRaises(ValueError, factorial, -15)

if __name__ == "__main__":
    unittest.main()

