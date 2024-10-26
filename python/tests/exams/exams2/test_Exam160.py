from unittest import TestCase

from exams.exams2.Exam160 import nextBeautifulNumber


class TestExam(TestCase):

    def test_next_beautiful_number(self):
        self.assertEqual(22, nextBeautifulNumber(1))
        self.assertEqual(1333, nextBeautifulNumber(1000))
        self.assertEqual(3133, nextBeautifulNumber(3000))
