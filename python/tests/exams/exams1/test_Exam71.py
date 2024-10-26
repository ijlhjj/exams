from unittest import TestCase

from exams.exams1.Exam71 import is_acronym


class TestExam(TestCase):

    def test_is_acronym(self):
        self.assertTrue(is_acronym(["alice", "bob", "charlie"], "abc"))
        self.assertFalse(is_acronym(["an", "apple"], "a"))
        self.assertTrue(is_acronym(["never", "gonna", "give", "up", "on", "you"], "ngguoy"))
