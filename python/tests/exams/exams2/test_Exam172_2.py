from unittest import TestCase

from exams.exams2.Exam172_2 import findChampion


class TestExam(TestCase):

    def test_find_champion(self):
        self.assertEqual(0, findChampion(3, [[0, 1], [1, 2]]))
        self.assertEqual(-1, findChampion(4, [[0, 2], [1, 3], [1, 2]]))
