from unittest import TestCase

from exams.exams2.Exam114 import splitNum


class TestExam(TestCase):

    def test_split_num(self):
        self.assertEqual(59, splitNum(4325))
        self.assertEqual(75, splitNum(687))
        self.assertEqual(1, splitNum(10))
        self.assertEqual(1, splitNum(10000))
