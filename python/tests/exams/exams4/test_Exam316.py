from unittest import TestCase

from exams.exams4.Exam316 import maxNumOfMarkedIndices


class Test(TestCase):

    def test_max_num_of_marked_indices(self):
        self.assertEqual(2, maxNumOfMarkedIndices([3, 5, 2, 4]))
        self.assertEqual(4, maxNumOfMarkedIndices([9, 2, 5, 4]))
        self.assertEqual(0, maxNumOfMarkedIndices([7, 6, 8]))
