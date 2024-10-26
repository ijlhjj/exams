from unittest import TestCase

from exams.exams2.Exam132 import maxProduct


class TestExam(TestCase):

    def test_max_product(self):
        self.assertEqual(16, maxProduct(["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]))
        self.assertEqual(4, maxProduct(["a", "ab", "abc", "d", "cd", "bcd", "abcd"]))
        self.assertEqual(0, maxProduct(["a", "aa", "aaa", "aaaa"]))
