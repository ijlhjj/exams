from unittest import TestCase

from exams.exams1.Exam53 import get_row


class TestExam(TestCase):

    def test_get_row(self):
        self.assertListEqual([1, 3, 3, 1], get_row(3))
        self.assertListEqual([1], get_row(0))
        self.assertListEqual([1, 1], get_row(1))
