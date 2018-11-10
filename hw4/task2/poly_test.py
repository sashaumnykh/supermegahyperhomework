from poly_logic import derivative
import unittest


class PolyTrueTest(unittest.TestCase):
    def test_polynomial(self):
        arg = '-3x^7 + 10x^5 - 4x^2 + 3'
        self.assertEqual(derivative(arg), '-21x^6+50x^4-8x^1')

    def test_first_degree_v1(self):
        arg = '27x^1'
        self.assertEqual(derivative(arg), '27')

    def test_empty_degree(self):
        arg = 'x^0'
        self.assertEqual(derivative(arg), '')

if __name__ == "__main__":
    unittest.main()
