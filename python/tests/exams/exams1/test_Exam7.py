from unittest import TestCase

from exams.exams1.Exam7 import length_of_longest_substring


class TestExam(TestCase):

    def test_length_of_longest_substring(self):
        self.assertEqual(3, length_of_longest_substring("abcabcbb"))
        self.assertEqual(1, length_of_longest_substring("bbbbb"))
        self.assertEqual(3, length_of_longest_substring("pwwkew"))
        self.assertEqual(2, length_of_longest_substring("aab"))  # 第 1 次提交 结尾字符串为 无重复最长子串 的测试用例
        self.assertEqual(2, length_of_longest_substring("abba"))  # 第 2 次提交 没有考虑发现重复字符后之前更小的重复下标不可再用 的测试用例
