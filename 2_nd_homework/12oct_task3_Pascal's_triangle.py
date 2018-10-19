import unittest
from math import factorial
def pascal(n):
    a=list()
    if type(n)!=int:
        raise TypeError ("Аргумент должен быть целым числом!")
    elif n<0:
        raise ValueError ("Аргумент должен быть неотрицательным целым числом!")
    else:
        for i in range(n):
            a.append(list())
            for j in range (i+1):
                a[i].append(int(factorial(i)/factorial(j)/factorial(i-j)))
        return a

#n = int(input())
#z = pascal(n)
#for i in range (n):
#    print (z[i])

class pascal_test(unittest.TestCase):
    def test_values(self):
        self.assertEqual(pascal(1),[[1]])
    def test_values1(self):
        self.assertEqual(pascal(3),[[1], [1, 1], [1, 2, 1]])
    def test_values2(self):
        self.assertEqual(pascal(5),[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]])
    def test_falsetype_str1(self):
        self.assertRaises(TypeError, factorial, 'aaaa')
    def test_falsetype_str2(self):
        self.assertRaises(TypeError, factorial, ' ')
    def test_falsetype_negative(self):
        self.assertRaises(ValueError, factorial, -12)

if __name__ == "__main__":
    unittest.main()
