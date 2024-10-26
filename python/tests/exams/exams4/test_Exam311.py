from unittest import TestCase

from exams.exams4.Exam311 import maxStrength


class Test(TestCase):

    def test_max_strength(self):
        self.assertEqual(1350, maxStrength([3, -1, -5, 2, 5, -9]))
        self.assertEqual(20, maxStrength([-4, -5, -4]))
        self.assertEqual(0, maxStrength([0, -1]))  # 第一次提交答案错误
        self.assertEqual(-9, maxStrength([-9]))  # 第二次提交答案错误
        self.assertEqual(0, maxStrength([0, -5, 0]))  # 第三次提交答案错误
