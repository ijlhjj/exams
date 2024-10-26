from unittest import TestCase

from exams.exams1.Exam29 import maximum_beauty


class TestExam(TestCase):

    def test_maximum_beauty(self):
        self.assertEqual(3, maximum_beauty([4, 6, 1, 2], 2))
        self.assertEqual(4, maximum_beauty([1, 1, 1, 1], 10))
