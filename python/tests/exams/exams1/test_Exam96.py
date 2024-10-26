from unittest import TestCase

from exams.exams1.Exam96 import queens_attack_the_king


class TestExam(TestCase):

    def test_queens_attack_the_king1(self):
        queens = [[0, 1], [1, 0], [4, 0], [0, 4], [3, 3], [2, 4]]
        king = [0, 0]
        actual = queens_attack_the_king(queens, king)
        actual.sort()

        expected = [[0, 1], [1, 0], [3, 3]]
        expected.sort()
        self.assertListEqual(expected, actual)

    def test_queens_attack_the_king2(self):
        queens = [[0, 0], [1, 1], [2, 2], [3, 4], [3, 5], [4, 4], [4, 5]]
        king = [3, 3]
        actual = queens_attack_the_king(queens, king)
        actual.sort()

        expected = [[2, 2], [3, 4], [4, 4]]
        expected.sort()
        self.assertListEqual(expected, actual)

    def test_queens_attack_the_king3(self):
        queens = [[5, 6], [7, 7], [2, 1], [0, 7], [1, 6], [5, 1], [3, 7], [0, 3], [4, 0], [1, 2], [6, 3], [5, 0],
                  [0, 4], [2, 2], [1, 1], [6, 4], [5, 4], [0, 0], [2, 6], [4, 5], [5, 2], [1, 4], [7, 5], [2, 3],
                  [0, 5], [4, 2], [1, 0], [2, 7], [0, 1], [4, 6], [6, 1], [0, 6], [4, 3], [1, 7]]
        king = [3, 4]
        actual = queens_attack_the_king(queens, king)
        actual.sort()

        expected = [[2, 3], [1, 4], [1, 6], [3, 7], [4, 3], [5, 4], [4, 5]]
        expected.sort()
        self.assertListEqual(expected, actual)
