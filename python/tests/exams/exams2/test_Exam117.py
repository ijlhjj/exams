from unittest import TestCase

from exams.exams2.Exam117 import findTheArrayConcVal


class TestExam(TestCase):

    def test_find_the_array_conc_val(self):
        self.assertEqual(596, findTheArrayConcVal([7, 52, 2, 4]))
        self.assertEqual(673, findTheArrayConcVal([5, 14, 13, 8, 12]))
