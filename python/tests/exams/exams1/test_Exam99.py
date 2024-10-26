from unittest import TestCase

from exams.exams1.Exam99 import is_reachable_at_time


class TestExam(TestCase):

    def test_is_reachable_at_time(self):
        self.assertTrue(is_reachable_at_time(2, 4, 7, 7, 6))
        self.assertFalse(is_reachable_at_time(3, 1, 7, 3, 3))
