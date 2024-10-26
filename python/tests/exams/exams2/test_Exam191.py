from unittest import TestCase

from exams.exams2.Exam191 import minimumRemoval


class TestExam(TestCase):

    def test_minimum_removal(self):
        self.assertEqual(4, minimumRemoval([4, 1, 6, 5]))
        self.assertEqual(7, minimumRemoval([2, 10, 3, 2]))
