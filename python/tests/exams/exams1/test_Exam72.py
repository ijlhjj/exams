from unittest import TestCase

from exams.exams1.Exam72 import minimum_sum


class TestExam(TestCase):

    def test_minimum_sum(self):
        self.assertEqual(18, minimum_sum(5, 4))
        self.assertEqual(3, minimum_sum(2, 6))
