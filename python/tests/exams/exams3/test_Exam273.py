from unittest import TestCase

from exams.exams3.Exam273 import modifiedMatrix


class Test(TestCase):

    def test_modified_matrix(self):
        self.assertListEqual([[1, 2, 9], [4, 8, 6], [7, 8, 9]], modifiedMatrix([[1, 2, -1], [4, -1, 6], [7, 8, 9]]))
        self.assertListEqual([[3, 2], [5, 2]], modifiedMatrix([[3, -1], [5, 2]]))
        self.assertListEqual(
            [[3, 1, 1, 3, 1, 2], [3, 3, 1, 0, 1, 3], [3, 2, 3, 0, 3, 1], [3, 0, 3, 3, 3, 1], [1, 1, 3, 3, 3, 0]],
            modifiedMatrix(
                [[3, 1, 1, -1, 1, 2], [-1, 3, 1, 0, 1, 3], [-1, 2, 3, 0, 3, 1], [-1, 0, -1, -1, -1, 1],
                 [1, 1, 3, 3, -1, 0]]))  # 第一次提交报错
