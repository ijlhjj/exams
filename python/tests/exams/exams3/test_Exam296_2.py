from unittest import TestCase

from exams.exams3.Exam296_2 import isArraySpecial


class Test(TestCase):

    def test_is_array_special(self):
        self.assertListEqual([False], isArraySpecial([3, 4, 1, 2, 6], [[0, 4]]))
        self.assertListEqual([False, True], isArraySpecial([4, 3, 1, 6], [[0, 2], [2, 3]]))
        self.assertListEqual([True], isArraySpecial([10, 2, 10, 9, 7], [[2, 3]]))  # 第一次提交答案错误
