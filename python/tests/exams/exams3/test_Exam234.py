from unittest import TestCase

from exams.exams3.Exam234 import maximumCount


class Test(TestCase):

    def test_maximum_count(self):
        self.assertEqual(3, maximumCount([-2, -1, -1, 1, 2, 3]))
        self.assertEqual(3, maximumCount([-3, -2, -1, 0, 0, 1, 2]))
        self.assertEqual(4, maximumCount([5, 20, 66, 1314]))
