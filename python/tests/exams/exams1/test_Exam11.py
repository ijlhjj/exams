from unittest import TestCase

from exams.exams1.Exam11 import reverse


class TestExam(TestCase):

    def test_reverse(self):
        self.assertEqual(321, reverse(123))
        self.assertEqual(-321, reverse(-123))
        self.assertEqual(21, reverse(120))
        self.assertEqual(0, reverse(0))
