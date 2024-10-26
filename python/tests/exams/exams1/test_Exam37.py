from unittest import TestCase

from exams.exams1.Exam37 import merge


class TestExam(TestCase):

    def test_merge1(self):
        intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
        result = merge(intervals)

        expected = [[1, 6], [8, 10], [15, 18]]
        self.assertListEqual(expected, result)

    def test_merge2(self):
        intervals = [[1, 4], [4, 5]]
        result = merge(intervals)

        expected = [[1, 5]]
        self.assertListEqual(expected, result)
