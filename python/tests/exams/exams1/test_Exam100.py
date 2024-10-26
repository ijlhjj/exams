from unittest import TestCase

from exams.exams1.Exam100 import minimum_string


class TestExam(TestCase):

    def test_minimum_string(self):
        self.assertEqual("aaabca", minimum_string("abc", "bca", "aaa"))
        self.assertEqual("aba", minimum_string("ab", "ba", "aba"))
        self.assertEqual("cab", minimum_string("cab", "a", "b"))  # 第一次提交错误
