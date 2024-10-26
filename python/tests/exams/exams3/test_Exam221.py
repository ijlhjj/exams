from unittest import TestCase

from exams.exams3.Exam221 import getHint


class Test(TestCase):

    def test_get_hint(self):
        self.assertEqual('0A4B', getHint('1122', '2211'))
        self.assertEqual('1A3B', getHint('1807', '7810'))
        self.assertEqual('1A1B', getHint('1123', '0111'))
