from unittest import TestCase

from exams.exams1.Exam8 import findMedianSortedArrays


class Test(TestCase):

    def test_find_median_sorted_arrays(self):
        self.assertEqual(2, findMedianSortedArrays([1, 3], [2]))
        self.assertEqual(2.5, findMedianSortedArrays([1, 2], [3, 4]))
