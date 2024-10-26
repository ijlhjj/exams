from unittest import TestCase

from exams.exams1.Exam1 import two_sum


class TestExam(TestCase):

    def test_two_sum1(self):
        ints = [2, 7, 11, 15]
        result = two_sum(ints, 9)

        expected = [0, 1]
        self.assertListEqual(expected, result)

    def test_two_sum2(self):
        """ 第 1 次提交未考虑列表原地排序出错的测试用例 """

        ints = [3, 2, 4]
        result = two_sum(ints, 6)

        expected = [1, 2]
        self.assertListEqual(expected, result)

    def test_two_sum3(self):
        """ 第 2 次提交未考虑重复元素的特殊处理测试用例 """

        ints = [3, 3]
        result = two_sum(ints, 6)

        expected = [0, 1]
        self.assertListEqual(expected, result)
