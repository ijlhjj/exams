from unittest import TestCase

from exams.exams1.Exam16 import fizz_buzz


class TestExam(TestCase):

    def test_fizz_buzz(self):
        expected = ["1", "2", "Fizz"]
        self.assertListEqual(expected, fizz_buzz(3))

        expected = ["1", "2", "Fizz", "4", "Buzz"]
        self.assertListEqual(expected, fizz_buzz(5))

        expected = ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
                    "FizzBuzz"]
        self.assertListEqual(expected, fizz_buzz(15))
