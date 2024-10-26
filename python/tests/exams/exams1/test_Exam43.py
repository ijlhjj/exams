from unittest import TestCase

from exams.exams1.Exam43 import count_complete_sub_arrays


class TestExam(TestCase):

    def test_count_complete_sub_arrays(self):
        self.assertEqual(4, count_complete_sub_arrays([1, 3, 1, 2, 2]))
        self.assertEqual(10, count_complete_sub_arrays([5, 5, 5, 5]))
