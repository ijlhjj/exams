from unittest import TestCase

from exams.exams2.Exam138 import shortestBeautifulSubstring


class TestExam(TestCase):

    def test_shortest_beautiful_substring(self):
        self.assertEqual("11001", shortestBeautifulSubstring("100011001", 3))
        self.assertEqual("11", shortestBeautifulSubstring("1011", 2))
        self.assertEqual("", shortestBeautifulSubstring("000", 1))
        self.assertEqual("1100100101011", shortestBeautifulSubstring("1100100101011001001", 7))  # 第1次提交结果错误
