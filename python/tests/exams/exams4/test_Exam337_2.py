from unittest import TestCase

from exams.exams4.Exam337_2 import countCompleteDayPairs


class Test(TestCase):

    def test_count_complete_day_pairs(self):
        self.assertEqual(2, countCompleteDayPairs([12, 12, 30, 24, 24]))
        self.assertEqual(3, countCompleteDayPairs([72, 48, 24, 3]))
