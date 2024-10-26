from unittest import TestCase

from exams.exams2.Exam103 import numberOfPoints


class TestExam(TestCase):

    def test_number_of_points(self):
        self.assertEqual(7, numberOfPoints([[3, 6], [1, 5], [4, 7]]))
        self.assertEqual(7, numberOfPoints([[1, 3], [5, 8]]))
