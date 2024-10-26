from unittest import TestCase

from exams.exams1.Exam63 import double_it
from exams.linkedlist import *


class TestExam(TestCase):

    def test_double_it1(self):
        expected = create_listnode([3, 7, 8])
        actual = double_it(create_listnode([1, 8, 9]))
        self.assertEqual(expected, actual)

    def test_double_it2(self):
        expected = create_listnode([1, 9, 9, 8])
        actual = double_it(create_listnode([9, 9, 9]))
        self.assertEqual(expected, actual)

    def test_double_it3(self):
        expected = create_listnode([0])
        actual = double_it(create_listnode([0]))
        self.assertEqual(expected, actual)
