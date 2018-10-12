import unittest

def perfect_number (n):
    summ_of_devisers = 0
    for i in range (1, n):
        if n%i == 0:
            summ_of_devisers = summ_of_devisers + i
    if n == summ_of_devisers:
        return True
    else:
        return False

test = int(input())
print (perfect_number(test))

class perfect_number_test(unittest.TestCase):
    def test_true_values(self):
        self.assertTrue(perfect_number(6))
        self.assertTrue(perfect_number(8128))

    def test_false_values(self):
        self.assertFalse(perfect_number(5))
        self.assertFalse(perfect_number(127))
        self.assertFalse(perfect_number(6324))

if __name__ == "__main__":
    unittest.main()