from unittest import TestCase

from exams.exams3.Exam284 import getGoodIndices


class Test(TestCase):

    def test_get_good_indices(self):
        self.assertListEqual([0, 2], getGoodIndices([[2, 3, 3, 10], [3, 3, 3, 1], [6, 1, 1, 4]], 2))
        self.assertListEqual([], getGoodIndices([[39, 3, 1000, 1000]], 17))
