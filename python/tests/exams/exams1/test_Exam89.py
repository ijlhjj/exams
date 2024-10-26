from unittest import TestCase

from exams.exams1.Exam89 import min_number


class TestExam(TestCase):

    def test_min_number(self):
        self.assertEqual(15, min_number([4, 1, 3], [5, 7]))
        self.assertEqual(3, min_number([3, 5, 2, 6], [3, 1, 7]))
