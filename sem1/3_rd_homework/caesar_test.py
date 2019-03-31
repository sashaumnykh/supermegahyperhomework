from caesar_logic import encrypt
from caesar_logic import decrypt
import unittest


class CaesarEncryptTests (unittest.TestCase):
    def test_helloworld(self):
        self.assertEqual(encrypt(3, "Hello, world!"), "Khoor, zruog!")

    def test_alldots(self):
        self.assertEqual(encrypt(-5, "....."), ".....")

    def test_emptyness(self):
        self.assertEqual(encrypt(15, ' '), ' ')

    def test_firstletters_back(self):
        self.assertEqual(encrypt(-3, "Aa"), "xX")

    def test_firstletters_forward(self):
        self.assertEqual(encrypt(10, "Aa"), "Kk")

    def test_lastletters_back(self):
        self.assertEqual(encrypt(-11, "Zz"), "Oo")

    def test_lastletters_forward1(self):
        self.assertEqual(encrypt(8, "Zz"), "hH")

    def test_lastletters_forward2(self):
        self.assertEqual(encrypt(7, "Zz"), "gG")

    def test_lastletters_forward3(self):
        self.assertEqual(encrypt(6, "Zz"), "fF")

    def test_statement1(self):
        self.assertEqual(encrypt(14, "101 loves Nayden"), "101 zCJsG boMrsB")

    def test_statement2(self):
        offset = -7
        text = "please give me 5 automatically"
        encrypted_text = "ieXTlX ZboX fX 5 TnmhfTmbVTeer"
        self.assertEqual(encrypt(offset, text), encrypted_text)

    def test_bigoffset(self):
        self.assertEqual(encrypt(25, "i want to sleep"), "H VzMS SN RKDDO")


class CaesarDecryptTests (unittest.TestCase):
    def test_helloworld(self):
        self.assertEqual(decrypt(3, "Khoor, zruog!"), "Hello, world!")

    def test_alldots(self):
        self.assertEqual(decrypt(-5, "....."), ".....")

    def test_emptyness(self):
        self.assertEqual(decrypt(15, ' '), ' ')

    def test_firstletters_back(self):
        self.assertEqual(decrypt(-3, "xX"), "Aa")

    def test_firstletters_forward(self):
        self.assertEqual(decrypt(10, "Kk"), "Aa")

    def test_lastletters_back(self):
        self.assertEqual(decrypt(-11, "Oo"), "Zz")

    def test_lastletters_forward1(self):
        self.assertEqual(decrypt(8, "hH"), "Zz")

    def test_lastletters_forward2(self):
        self.assertEqual(decrypt(7, "gG"), "Zz")

    def test_lastletters_forward3(self):
        self.assertEqual(decrypt(6, "fF"), "Zz")

    def test_statement1(self):
        self.assertEqual(decrypt(-9, "101 cfmVj ERpUVe"), "101 loves Nayden")

    def test_statement2(self):
        text = "AwplDp rtGp xp 5 lFEzxlEtnlwwJ"
        decrypted_text = "please give me 5 automatically"
        self.assertEqual(decrypt(11, text), decrypted_text)

    def test_bigoffset(self):
        self.assertEqual(decrypt(19, "B PtGM MH LExxI"), "i want to sleep")


if __name__ == "__main__":
    unittest.main()
