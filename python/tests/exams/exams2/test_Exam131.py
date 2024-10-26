from unittest import TestCase

from exams.exams2.Exam131 import findRepeatedDnaSequences


class TestExam(TestCase):

    def test_find_repeated_dna_sequences(self):
        self.assertListEqual(["CCCCCAAAAA", "AAAAACCCCC"], findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"))
        self.assertListEqual(["AAAAAAAAAA"], findRepeatedDnaSequences("AAAAAAAAAAAAA"))
