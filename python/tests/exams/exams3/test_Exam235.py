from unittest import TestCase

from exams.exams3.Exam235 import maximumBinaryString


class Test(TestCase):

    def test_maximum_binary_string(self):
        self.assertEqual("111011", maximumBinaryString("000110"))
        self.assertEqual("01", maximumBinaryString("01"))
