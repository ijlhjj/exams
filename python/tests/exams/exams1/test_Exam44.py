from unittest import TestCase

from exams.exams1.Exam44 import reverse_words


class TestExam(TestCase):

    def test_reverse_words(self):
        self.assertEqual("blue is sky the", reverse_words("the sky is blue"))
        self.assertEqual("world hello", reverse_words("  hello world  "))
        self.assertEqual("example good a", reverse_words("a good   example"))
