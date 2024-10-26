from unittest import TestCase

from exams.exams3.Exam268 import nextGreaterElements


class Test(TestCase):

    def test_next_greater_elements(self):
        self.assertListEqual([2, -1, 2], nextGreaterElements([1, 2, 1]))
        self.assertListEqual([2, 3, 4, -1, 4], nextGreaterElements([1, 2, 3, 4, 3]))
