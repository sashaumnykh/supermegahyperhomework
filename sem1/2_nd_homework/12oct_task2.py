import unittest

def perfect_number (n):
    summ_of_devisers = 0
    if type(n)!=int:
        raise TypeError ("Аргумент должен быть целым числом!")
    elif n < 0:
        raise ValueError("Аргумент должен быть неотрицательным целым числом!")
    else:
        for i in range (1, n):
            if n%i == 0:
                summ_of_devisers = summ_of_devisers + i
        if n == summ_of_devisers:
            return True
        else:
            return False

#test = int(input())
#print (perfect_number(test))

class perfect_number_test(unittest.TestCase):
    def test_true_value1(self):
        self.assertTrue(perfect_number(6))
    def test_true_value2(self):
        self.assertTrue(perfect_number(8128))
    def test_false_value1(self):
        self.assertFalse(perfect_number(5))
    def test_false_value2(self):
        self.assertFalse(perfect_number(127))
    def test_false_value3(self):
        self.assertFalse(perfect_number(6324))
    def test_falsetype_str(self):
        self.assertRaises(TypeError, perfect_number, ' ')
    def test_falsetype_negative(self):
        self.assertRaises(ValueError, perfect_number, -19)

if __name__ == "__main__":
    unittest.main()
