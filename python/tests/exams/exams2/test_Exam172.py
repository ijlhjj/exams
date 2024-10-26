from unittest import TestCase

from exams.exams2.Exam172 import findChampion


class TestExam(TestCase):

    def test_find_champion(self):
        self.assertEqual(0, findChampion([[0, 1], [0, 0]]))
        self.assertEqual(1, findChampion([[0, 0, 1], [1, 0, 1], [0, 0, 0]]))
