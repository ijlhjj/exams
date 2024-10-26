from unittest import TestCase

from exams.exams2.Exam102 import giveGem


class TestExam(TestCase):

    def test_give_gem(self):
        self.assertEqual(2, giveGem([3, 1, 2], [[0, 2], [2, 1], [2, 0]]))
        self.assertEqual(75, giveGem([100, 0, 50, 100], [[0, 2], [0, 1], [3, 0], [3, 0]]))
        self.assertEqual(0, giveGem([0, 0, 0, 0], [[1, 2], [3, 1], [1, 2]]))
