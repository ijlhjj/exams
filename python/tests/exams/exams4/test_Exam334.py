from unittest import TestCase

from exams.exams4.Exam334 import minOperations


class Test(TestCase):

    def test_min_operations(self):
        self.assertEqual(3, minOperations([0, 1, 1, 1, 0, 0]))
        self.assertEqual(-1, minOperations([0, 1, 1, 1]))
