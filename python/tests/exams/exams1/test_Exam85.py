from unittest import TestCase

from exams.exams1.Exam85 import ways_to_buy_pens_pencils


class TestExam(TestCase):

    def test_ways_to_buy_pens_pencils(self):
        self.assertEqual(9, ways_to_buy_pens_pencils(20, 10, 5))
        self.assertEqual(1, ways_to_buy_pens_pencils(5, 10, 10))
