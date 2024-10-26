from unittest import TestCase

from exams.exams3.Exam248 import orangesRotting


class Test(TestCase):

    def test_oranges_rotting(self):
        self.assertEqual(4, orangesRotting([[2, 1, 1], [1, 1, 0], [0, 1, 1]]))
        self.assertEqual(-1, orangesRotting([[2, 1, 1], [0, 1, 1], [1, 0, 1]]))
        self.assertEqual(0, orangesRotting([[0, 2]]))
