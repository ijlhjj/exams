from unittest import TestCase

from exams.exams3.Exam255 import missingRolls


class Test(TestCase):

    def test_missing_rolls(self):
        self.assertListEqual([6, 6], missingRolls([3, 2, 4, 3], 4, 2))
        self.assertListEqual([3, 2, 2, 2], missingRolls([1, 5, 6], 3, 4))
        self.assertListEqual([], missingRolls([1, 2, 3, 4], 6, 4))
        self.assertListEqual([5], missingRolls([1], 3, 1))

        self.assertListEqual(
            [5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
             4, 4, 4, 4],
            missingRolls([4, 5, 6, 2, 3, 6, 5, 4, 6, 4, 5, 1, 6, 3, 1, 4, 5, 5, 3, 2, 3, 5, 3, 2, 1, 5, 4, 3, 5, 1, 5],
                         4, 40))  # 第一次提交答案错误
