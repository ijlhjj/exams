from unittest import TestCase

from exams.exams1.Exam15 import maximum_wealth


class TestExam(TestCase):

    def test_maximum_wealth(self):
        self.assertEqual(6, maximum_wealth([[1, 2, 3], [3, 2, 1]]))
        self.assertEqual(10, maximum_wealth([[1, 5], [7, 3], [3, 5]]))
        self.assertEqual(17, maximum_wealth([[2, 8, 7], [7, 1, 3], [1, 9, 5]]))
