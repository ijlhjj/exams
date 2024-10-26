from unittest import TestCase

from exams.exams1.Exam22 import minimum_beautiful_substrings


class TestExam(TestCase):

    def test_minimum_beautiful_substrings(self):
        self.assertEqual(2, minimum_beautiful_substrings('1011'))
        self.assertEqual(3, minimum_beautiful_substrings('111'))
        self.assertEqual(-1, minimum_beautiful_substrings('0'))
        self.assertEqual(4, minimum_beautiful_substrings('100111000110111'))  # 第1次提交结果错误
        self.assertEqual(3, minimum_beautiful_substrings('10110011100011'))  # 第2次提交结果错误
        self.assertEqual(6, minimum_beautiful_substrings('101101111101'))  # 第3次提交结果错误
        self.assertEqual(-1, minimum_beautiful_substrings('001001101110000'))  # 第4次提交结果错误
        self.assertEqual(-1, minimum_beautiful_substrings('110001100110'))  # 第5次提交结果错误
        self.assertEqual(-1, minimum_beautiful_substrings('111100001101111'))  # 第6次提交结果错误
