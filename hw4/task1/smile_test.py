from smile_logic import smile
import unittest

class SmileTrueTest(unittest.TestCase):
    def test_empty(self):
        self.assertTrue(smile(''))
    def test_spaces(self):
        self.assertTrue(smile('     '))
    def test_numbers(self):
        self.assertTrue(smile('123548'))
    def test_words(self):
        self.assertTrue(smile('аааа, спасите, слишком много дееееееел'))
    def test_sole_1(self):
        self.assertTrue(smile('[]'))
    def test_sole_2(self):
        self.assertTrue(smile('{}'))
    def test_sole_3(self):
        self.assertTrue(smile("()"))
    def test_trio(self):
        self.assertTrue(smile('[[[]]]'))
    def test_mixed(self):
        self.assertTrue(smile("[(({[()]}))]"))
    def test_with_words(self):
        self.assertTrue(smile("[fgtb{dv(ffn)}dvnjfnj(dvfdb)]"))

class SmileFalseTest(unittest.TestCase):
    def test_single_1(self):
        self.assertFalse(smile('['))
    def test_single_2(self):
        self.assertFalse(smile('}'))
    def test_one_and_a_half(self):
        self.assertFalse(smile('[{]'))
    def test_false_mix(self):
        self.assertFalse(smile('[dvf[]]dv[[(b{fbf))'))
    def test_zero_imagination(self):
        self.assertFalse(smile('{а{ _ __ @{'))



if __name__ == "__main__":
    unittest.main()