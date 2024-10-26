from unittest import TestCase

from exams.exams1.Exam87 import eliminate_maximum


class TestExam(TestCase):

    def test_eliminate_maximum1(self):
        dist = [1, 3, 4]
        speed = [1, 1, 1]
        self.assertEqual(3, eliminate_maximum(dist, speed))

    def test_eliminate_maximum2(self):
        dist = [1, 1, 2, 3]
        speed = [1, 1, 1, 1]
        self.assertEqual(1, eliminate_maximum(dist, speed))

    def test_eliminate_maximum3(self):
        dist = [3, 2, 4]
        speed = [5, 3, 2]
        self.assertEqual(1, eliminate_maximum(dist, speed))
