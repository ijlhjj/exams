from unittest import TestCase

from exams.exams3.Exam290 import maxPointsInsideSquare


class Test(TestCase):

    def test_max_points_inside_square(self):
        self.assertEqual(2, maxPointsInsideSquare([[2, 2], [-1, -2], [-4, 4], [-3, 1], [3, -3]], "abdca"))
        self.assertEqual(1, maxPointsInsideSquare([[1, 1], [-2, -2], [-2, 2]], "abb"))
        self.assertEqual(0, maxPointsInsideSquare([[1, 1], [-1, -1], [2, -2]], "ccd"))
        self.assertEqual(1, maxPointsInsideSquare([[-6, -4], [8, -1], [3, 9]], "ccc"))  # 第一次提交答案错误
        self.assertEqual(1, maxPointsInsideSquare([[9, 28], [6, -28], [-12, 9], [-18, -8], [-35, -32], [-13, 23]],
                                                  "bbffed"))  # 第二次提交答案错误
        self.assertEqual(5, maxPointsInsideSquare(
            [[48, 81], [-2, 76], [66, -9], [-44, -50], [-42, 76], [-33, 28], [52, -76], [75, -7], [-51, 5]],
            "ahgebbhfh"))  # 第三次提交答案错误
