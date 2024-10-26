from unittest import TestCase

from exams.exams1.Exam54 import reverse_words


class TestExam(TestCase):

    def test_reverse_words(self):
        self.assertEqual("s'teL ekat edoCteeL tsetnoc", reverse_words("Let's take LeetCode contest"))
        self.assertEqual("doG gniD", reverse_words("God Ding"))
