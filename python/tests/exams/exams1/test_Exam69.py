from unittest import TestCase

from exams.exams1.Exam69 import merge_two_lists
from exams.linkedlist import *


class TestExam(TestCase):

    def test_merge_two_lists1(self):
        l1 = create_listnode([1, 2, 4])
        l2 = create_listnode([1, 3, 4])

        actual = merge_two_lists(l1, l2)

        expected = create_listnode([1, 1, 2, 3, 4, 4])
        self.assertEqual(expected, actual)

    def test_merge_two_lists2(self):
        self.assertIsNone(merge_two_lists(None, None))

    def test_merge_two_lists3(self):
        actual = merge_two_lists(None, create_listnode([0]))
        expected = create_listnode([0])
        self.assertEqual(expected, actual)
