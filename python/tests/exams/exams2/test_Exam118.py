from unittest import TestCase

from exams.exams2.Exam118 import avoidFlood
from exams.test_util import read_nums_from_file


class TestExam(TestCase):

    def test_avoid_flood1(self):
        self.assertListEqual([-1, -1, -1, -1], avoidFlood([1, 2, 3, 4]))
        self.assertListEqual([-1, -1, 2, 1, -1, -1], avoidFlood([1, 2, 0, 0, 2, 1]))
        self.assertListEqual([], avoidFlood([1, 2, 0, 1, 2]))
        self.assertListEqual([-1, 69, 1, 1, -1], avoidFlood([69, 0, 0, 0, 69]))  # 第1次提交结果错误
        self.assertListEqual([], avoidFlood([0, 1, 1]))  # 第2次提交结果错误
        self.assertListEqual([-1, 1, -1, 2, -1, -1], avoidFlood([1, 0, 2, 0, 2, 1]))  # 第3次提交结果错误
        self.assertListEqual([-1, 1, -1, 2, -1, 3, -1, 2, 1, 1, -1, -1, -1],
                             avoidFlood([1, 0, 2, 0, 3, 0, 2, 0, 0, 0, 1, 2, 3]))  # 第4次提交结果错误

    # 第5次提交超时
    def test_avoid_flood2(self):
        nums = read_nums_from_file('resources/exams2_test_Exam118_1.txt')
        result = read_nums_from_file('resources/exams2_test_Exam118_1_Result.txt')
        self.assertListEqual(result, avoidFlood(nums))
