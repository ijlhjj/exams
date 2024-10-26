from unittest import TestCase

from exams.exams1.Exam20 import relocate_marbles


class TestExam(TestCase):

    def test_relocate_marbles1(self):
        nums = [1, 6, 7, 8]
        move_from = [1, 7, 2]
        move_to = [2, 9, 5]

        result = relocate_marbles(nums, move_from, move_to)

        expected = [5, 6, 8, 9]
        self.assertListEqual(expected, result)

    def test_relocate_marbles2(self):
        nums = [1, 1, 3, 3]
        move_from = [1, 3]
        move_to = [2, 2]

        result = relocate_marbles(nums, move_from, move_to)

        expected = [2]
        self.assertListEqual(expected, result)
