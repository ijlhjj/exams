from unittest import TestCase

from exams.exams1.Exam5 import is_valid


class TestExam(TestCase):

    def test_is_valid(self):
        self.assertTrue(is_valid("()"))
        self.assertTrue(is_valid("()[]{}"))
        self.assertFalse(is_valid("(]"))
