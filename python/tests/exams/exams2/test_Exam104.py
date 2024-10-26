from unittest import TestCase

from exams.exams2.Exam104 import sumIndicesWithKSetBits


class TestExam(TestCase):

    def test_sum_indices_with_kset_bits(self):
        self.assertEqual(13, sumIndicesWithKSetBits([5, 10, 1, 5, 2], 1))
        self.assertEqual(1, sumIndicesWithKSetBits([4, 3, 2, 1], 2))
