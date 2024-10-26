from unittest import TestCase

from exams.exams1.Exam10 import convert


class TestExam(TestCase):

    def test_convert(self):
        self.assertEqual("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3))
        self.assertEqual("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4))
        self.assertEqual("A", convert("A", 1))
        self.assertEqual("AB", convert("AB", 1))
