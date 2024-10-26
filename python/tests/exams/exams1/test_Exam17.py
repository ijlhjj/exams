from unittest import TestCase

from exams.exams1.Exam17 import middle_node
from exams.linkedlist import *


class TestExam(TestCase):

    def test_middle_node1(self):
        nodes = create_listnode([1, 2, 3, 4, 5])
        node = middle_node(nodes)
        self.assertEqual(3, node.val)

    def test_middle_node2(self):
        nodes = create_listnode([1, 2, 3, 4, 5, 6])
        node = middle_node(nodes)
        self.assertEqual(4, node.val)
