from unittest import TestCase

from exams.exams1.Exam26 import minimum_operations


class TestExam(TestCase):

    def test_minimum_operations(self):
        self.assertEqual(3, minimum_operations([1, 5, 0, 3, 5]))
        self.assertEqual(0, minimum_operations([0]))
