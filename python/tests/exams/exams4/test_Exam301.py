from unittest import TestCase

from exams.exams4.Exam301 import minimumOperationsToMakeKPeriodic


class Test(TestCase):

    def test_minimum_operations_to_make_kperiodic(self):
        self.assertEqual(1, minimumOperationsToMakeKPeriodic("leetcodeleet", 4))
        self.assertEqual(3, minimumOperationsToMakeKPeriodic("leetcoleet", 2))
