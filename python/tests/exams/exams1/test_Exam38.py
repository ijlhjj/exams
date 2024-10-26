from unittest import TestCase

from exams.exams1.Exam38 import longest_valid_substring


class TestExam(TestCase):

    def test_longest_valid_substring(self):
        self.assertEqual(4, longest_valid_substring('cbaaaabc', ["aaa", "cb"]))
        self.assertEqual(4, longest_valid_substring('leetcode', ["de", "le", "e"]))
