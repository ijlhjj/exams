from unittest import TestCase

from exams.exams1.Exam77 import reverse_list
from exams.linkedlist import *


class TestExam(TestCase):

    def test_reverse_list1(self):
        head = create_listnode([1, 2, 3, 4, 5])
        expected = create_listnode([5, 4, 3, 2, 1])
        actual = reverse_list(head)
        self.assertEqual(expected, actual)

    def test_reverse_list2(self):
        head = create_listnode([1, 2])
        expected = create_listnode([2, 1])
        actual = reverse_list(head)
        self.assertEqual(expected, actual)

    def test_reverse_list3(self):
        self.assertEqual(None, reverse_list(None))
