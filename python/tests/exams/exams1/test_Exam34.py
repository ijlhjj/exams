from unittest import TestCase

from exams.exams1.Exam34 import max_array_value


class TestExam(TestCase):

    def test_max_array_value(self):
        self.assertEqual(21, max_array_value([2, 3, 7, 9, 3]))
        self.assertEqual(11, max_array_value([5, 3, 3]))
