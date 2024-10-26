from unittest import TestCase

from exams.exams2.Exam153 import closeStrings


class TestExam(TestCase):

    def test_close_strings(self):
        self.assertTrue(closeStrings("abc", "bca"))
        self.assertFalse(closeStrings("a", "aa"))
        self.assertTrue(closeStrings("cabbba", "abbccc"))
        self.assertFalse(closeStrings("cabbba", "aabbss"))
