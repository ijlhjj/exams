from unittest import TestCase

from exams.exams3.Exam295 import maximumSetSize


class Test(TestCase):

    def test_maximum_set_size(self):
        self.assertEqual(2, maximumSetSize([1, 2, 1, 2], [1, 1, 1, 1]))
        self.assertEqual(5, maximumSetSize([1, 2, 3, 4, 5, 6], [2, 3, 2, 3, 2, 3]))
        self.assertEqual(6, maximumSetSize([1, 1, 2, 2, 3, 3], [4, 4, 5, 5, 6, 6]))
