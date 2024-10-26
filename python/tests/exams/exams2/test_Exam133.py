from unittest import TestCase

from exams.exams2.Exam133 import vowelStrings


class TestExam(TestCase):

    def test_vowel_strings(self):
        self.assertEqual(2, vowelStrings(["are", "amy", "u"], 0, 2))
        self.assertEqual(3, vowelStrings(["hey", "aeo", "mu", "ooo", "artro"], 1, 4))
