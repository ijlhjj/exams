from unittest import TestCase

from exams.exams2.Exam188 import repeatLimitedString
from exams.test_util import read_lines_from_file


class TestExam(TestCase):

    def test_repeat_limited_string1(self):
        self.assertEqual("zzcccac", repeatLimitedString("cczazcc", 3))
        self.assertEqual("bbabaa", repeatLimitedString("aababab", 2))

    # 第1次提交超时
    def test_repeat_limited_string2(self):
        lines = read_lines_from_file('resources/exams2_test_Exam188_1.txt')
        self.assertEqual(lines[1], repeatLimitedString(lines[0], 35687))

    # 第2次提交超时
    def test_repeat_limited_string3(self):
        lines = read_lines_from_file('resources/exams2_test_Exam188_2.txt')
        self.assertEqual(lines[1], repeatLimitedString(lines[0], 1))
