from unittest import TestCase

from exams.exams1.Exam82_2 import search_range


class TestExam(TestCase):

    def test_search_range1(self):
        actual = search_range([5, 7, 7, 8, 8, 10], 8)
        expected = [3, 4]
        self.assertListEqual(expected, actual)

    def test_search_range2(self):
        actual = search_range([5, 7, 7, 8, 8, 10], 6)
        expected = [-1, -1]
        self.assertListEqual(expected, actual)

    def test_search_range3(self):
        actual = search_range([], 0)
        expected = [-1, -1]
        self.assertListEqual(expected, actual)
