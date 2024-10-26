from unittest import TestCase

from exams.exams1.Exam4 import longest_common_prefix


class TestExam(TestCase):

    def test_longest_common_prefix1(self):
        strs = ["flower", "flow", "flight"]
        self.assertEqual("fl", longest_common_prefix(strs))

    def test_longest_common_prefix2(self):
        strs = ["dog", "racecar", "car"]
        self.assertEqual("", longest_common_prefix(strs))

    def test_longest_common_prefix3(self):
        strs = ["ab", "a"]
        self.assertEqual("a", longest_common_prefix(strs))
