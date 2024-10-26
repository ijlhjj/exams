from unittest import TestCase

from exams.exams2.Exam187 import countWords


class TestExam(TestCase):

    def test_count_words(self):
        self.assertEqual(2, countWords(["leetcode", "is", "amazing", "as", "is"], ["amazing", "leetcode", "is"]))
        self.assertEqual(0, countWords(["b", "bb", "bbb"], ["a", "aa", "aaa"]))
        self.assertEqual(1, countWords(["a", "ab"], ["a", "a", "a", "ab"]))
