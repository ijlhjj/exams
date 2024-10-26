from unittest import TestCase

from exams.exams1.Exam27 import check_array


class TestExam(TestCase):

    def test_check_array(self):
        self.assertTrue(check_array([2, 2, 3, 1, 1, 0], 3))
        self.assertFalse(check_array([1, 3, 1, 1], 2))
