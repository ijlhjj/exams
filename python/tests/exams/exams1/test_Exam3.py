from unittest import TestCase

from exams.exams1.Exam3 import roman_to_int


class TestExam(TestCase):

    def test_roman_to_int(self):
        self.assertEqual(3, roman_to_int("III"))
        self.assertEqual(4, roman_to_int("IV"))
        self.assertEqual(9, roman_to_int("IX"))
        self.assertEqual(58, roman_to_int("LVIII"))
        self.assertEqual(1994, roman_to_int("MCMXCIV"))
