from unittest import TestCase

from exams.exams1.Exam2 import is_palindrome


class TestExam(TestCase):

    def test_is_palindrome(self):
        self.assertTrue(is_palindrome(121))
        self.assertFalse(is_palindrome(-121))
        self.assertFalse(is_palindrome(10))
