from unittest import TestCase

from exams.exams1.Exam18 import can_construct


class TestExam(TestCase):

    def test_can_construct(self):
        self.assertFalse(can_construct('a', 'b'))
        self.assertFalse(can_construct('aa', 'ab'))
        self.assertTrue(can_construct('aa', 'aab'))
