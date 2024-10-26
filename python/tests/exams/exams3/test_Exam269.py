from unittest import TestCase

from exams.exams3.Exam269 import smallestString


class Test(TestCase):

    def test_smallest_string(self):
        self.assertEqual('baabc', smallestString('cbabc'))
        self.assertEqual('abaab', smallestString('acbbc'))
        self.assertEqual('kddsbncd', smallestString('leetcode'))
