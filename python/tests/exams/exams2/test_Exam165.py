from unittest import TestCase

from exams.exams2.Exam165 import makeSmallestPalindrome


class TestExam(TestCase):

    def test_make_smallest_palindrome(self):
        self.assertEqual('efcfe', makeSmallestPalindrome('egcfe'))
        self.assertEqual('abba', makeSmallestPalindrome('abcd'))
        self.assertEqual('neven', makeSmallestPalindrome('seven'))
