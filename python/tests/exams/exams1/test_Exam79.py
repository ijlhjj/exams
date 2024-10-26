from unittest import TestCase

from exams.exams1.Exam79 import reverse_left_words


class TestExam(TestCase):

    def test_reverse_left_words(self):
        self.assertEqual("cdefgab", reverse_left_words("abcdefg", 2))
        self.assertEqual("umghlrlose", reverse_left_words("lrloseumgh", 6))
