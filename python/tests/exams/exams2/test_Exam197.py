from unittest import TestCase

from exams.exams2.Exam197 import magicTower


class TestExam(TestCase):

    def test_magic_tower(self):
        self.assertEqual(1, magicTower([100, 100, 100, -250, -60, -140, -50, -50, 100, 150]))
        self.assertEqual(-1, magicTower([-200, -300, 400, 0]))
