from unittest import TestCase

from exams.exams2.Exam168 import minCostClimbingStairs


class TestExam(TestCase):

    def test_min_cost_climbing_stairs(self):
        self.assertEqual(15, minCostClimbingStairs([10, 15, 20]))
        self.assertEqual(6, minCostClimbingStairs([1, 100, 1, 1, 1, 100, 1, 1, 100, 1]))
