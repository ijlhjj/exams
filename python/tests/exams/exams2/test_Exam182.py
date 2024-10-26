from unittest import TestCase

from exams.exams2.Exam182 import canConstruct


class TestExam(TestCase):

    def test_can_construct(self):
        self.assertFalse(canConstruct('a', 'b'))
        self.assertFalse(canConstruct('aa', 'ab'))
        self.assertTrue(canConstruct('aa', 'aab'))
