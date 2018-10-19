import time
import unittest
from memory_profiler import profile
@profile
def factorial(n):
    if type(n)!= int:
        raise TypeError ("Нужно ввести число!")
    else: n=int(n)
    if n<0:
        raise RecursionError ("Нужно ввести неотрицательное число!")
    elif n==0:
        return 1
    else:
        return n*factorial(n-1)

start_time = time.time()
#factorial(5)
#test = input()
#print (factorial(test))
print(time.time() - start_time)

class factorial_test(unittest.TestCase):
    def test_5(self):
        self.assertEqual(factorial(5),120)
    def test_0(self):
        self.assertEqual(factorial(0),1)
    def test_3(self):
        self.assertEqual(factorial(3),6)
    def test_falsetype(self):
        self.assertRaises(factorial('vfgb'), TypeError)

if __name__ == "__main__":
    unittest.main()
<<<<<<< HEAD:12oct_task1_fact recursion.py
=======
    
>>>>>>> 13582e6bb411575b1d230b579bf4f646c0e4f549:2_nd_homework/12oct_task1_fact recursion.py
