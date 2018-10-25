from balls_collide import balls_collide
import unittest


class BallsCollideTests (unittest.TestCase):
    def test_true_1(self):
        self.assertTrue(balls_collide((5.5, 2.4, 8.0), (5.0, 5.7, 2.0)))

    def test_true_2(self):
        self.assertTrue(balls_collide((-2, -5, 9.0), (6.57, -4.81, 2.5)))

    def test_true_3(self):
        self.assertTrue(balls_collide((-1, 3, 2.7), (0, 1.84, 1.1)))

    def test_true_4(self):
        self.assertTrue(balls_collide((-5.7, -3, 0), (-6.59, -2.58, 4.8)))

    def test_true_5(self):
        self.assertTrue(balls_collide((2, 2, 5), (2, 2, 5)))

    def test_true_6(self):
        self.assertTrue(balls_collide((-5.7, -3, 0), (-5.7, -3, 0)))

    def test_true_7(self):
        self.assertTrue(balls_collide((0, 0, 0), (0, 0, 0)))

    def test_false_1(self):
        self.assertFalse(balls_collide((-7.2, 4.9, 9.3), (4.9, -7.2, 6.8)))

    def test_false_2(self):
        self.assertFalse(balls_collide((7.4, -4.15, 6.23), (-8.1, 0.25, 7.23)))

    def test_error_1(self):
        self.assertRaises(ValueError, balls_collide, (11.5, 53.9, -82), (-25.2, -7.3, 0))

    def test_error_2(self):
        self.assertRaises(ValueError, balls_collide, (7.22, 11, -4.2), (3.25, -7.65, 30))


if __name__ == "__main__":
    unittest.main()
