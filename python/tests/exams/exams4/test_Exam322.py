from unittest import TestCase

from exams.exams4.Exam322 import findJudge


class Test(TestCase):

    def test_find_judge(self):
        self.assertEqual(2, findJudge(2, [[1, 2]]))
        self.assertEqual(3, findJudge(3, [[1, 3], [2, 3]]))
        self.assertEqual(-1, findJudge(3, [[1, 3], [2, 3], [3, 1]]))
