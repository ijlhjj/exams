from unittest import TestCase

from exams.exams1.Exam76 import reverse_print
from exams.linkedlist import *


class TestExam(TestCase):

    def test_reverse_print(self):
        head = create_listnode([1, 3, 2])
        nums = reverse_print(head)

        expected = [2, 3, 1]
        self.assertListEqual(expected, nums)
