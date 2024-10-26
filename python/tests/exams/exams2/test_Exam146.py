from unittest import TestCase

from exams.exams2.Exam146 import minDeletion


class TestExam(TestCase):

    def test_min_deletion(self):
        self.assertEqual(1, minDeletion([1, 1, 2, 3, 5]))
        self.assertEqual(2, minDeletion([1, 1, 2, 2, 3, 3]))
        self.assertEqual(6, minDeletion(
            [2, 6, 2, 5, 8, 9, 7, 2, 2, 5, 6, 2, 2, 0, 6, 8, 7, 3, 9, 2, 1, 1, 3, 2, 6, 2, 4, 6, 5, 8, 4, 8, 7, 0, 4, 8,
             7, 8, 4, 1, 1, 4, 0, 1, 5, 7, 7, 5, 9, 7, 5, 5, 8, 6, 4, 3, 6, 5, 1, 6, 7, 6, 9, 9, 6, 8, 6, 0, 9, 5, 6, 7,
             6, 9, 5, 5, 7, 3, 0, 0, 5, 5, 4, 8, 3, 9, 3, 4, 1, 7, 9, 3, 1, 8, 8, 9, 1, 6, 0, 0]))  # 第1次提交答案错误
