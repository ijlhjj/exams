from unittest import TestCase

from exams.exams1.Exam90 import count_symmetric_integers


class TestExam(TestCase):

    def test_count_symmetric_integers(self):
        self.assertEqual(9, count_symmetric_integers(1, 100))
        self.assertEqual(4, count_symmetric_integers(1200, 1230))
