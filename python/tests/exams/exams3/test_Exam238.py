from unittest import TestCase

from exams.exams3.Exam238 import findOriginalArray


class Test(TestCase):

    def test_find_original_array(self):
        self.assertEqual([1, 3, 4], findOriginalArray([1, 3, 4, 2, 6, 8]))
        self.assertEqual([], findOriginalArray([6, 3, 0, 1]))
        self.assertEqual([], findOriginalArray([1]))
        self.assertEqual([0, 0], findOriginalArray([0, 0, 0, 0]))
        self.assertEqual([], findOriginalArray([3, 3, 3, 3]))
        self.assertEqual([], findOriginalArray([2, 4, 3, 2]))
