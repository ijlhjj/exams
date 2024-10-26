from unittest import TestCase

from exams.exams4.Exam321 import edgeScore


class Test(TestCase):

    def test_edge_score(self):
        self.assertEqual(7, edgeScore([1, 0, 0, 0, 0, 7, 7, 5]))
        self.assertEqual(0, edgeScore([2, 0, 0, 2]))
