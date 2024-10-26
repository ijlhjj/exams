from unittest import TestCase

from exams.exams3.Exam262 import maximumBeauty


class Test(TestCase):

    def test_maximum_beauty(self):
        self.assertEqual(3, maximumBeauty([4, 6, 1, 2], 2))
        self.assertEqual(4, maximumBeauty([1, 1, 1, 1], 10))
