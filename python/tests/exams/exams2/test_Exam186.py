from unittest import TestCase

from exams.exams2.Exam186 import addMinimum


class TestExam(TestCase):

    def test_add_minimum(self):
        self.assertEqual(2, addMinimum("b"))
        self.assertEqual(6, addMinimum("aaa"))
        self.assertEqual(0, addMinimum("abc"))
