from unittest import TestCase

from exams.exams1.Exam58 import search


class TestExam(TestCase):

    def test_search(self):
        self.assertTrue(search([2, 5, 6, 0, 0, 1, 2], 0))
        self.assertFalse(search([2, 5, 6, 0, 0, 1, 2], 3))
