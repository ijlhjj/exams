from unittest import TestCase

from exams.exams3.Exam281 import accountsMerge


class Test(TestCase):

    def test_accounts_merge(self):
        self.assertEqual([['John', 'johnnybravo@mail.com'],
                          ['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'],
                          ['Mary', 'mary@mail.com']], accountsMerge(
            [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"],
             ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]))

        self.assertEqual(
            [["Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"], ["Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"],
             ["Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"],
             ["Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"],
             ["Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"]], accountsMerge(
                [["Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"],
                 ["Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"],
                 ["Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"],
                 ["Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"],
                 ["Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"]]))

        # 第一次提交答案错误
        self.assertEqual(
            [["David", "David0@m.co", "David1@m.co", "David2@m.co", "David3@m.co", "David4@m.co", "David5@m.co"]],
            accountsMerge(
                [["David", "David0@m.co", "David1@m.co"], ["David", "David3@m.co", "David4@m.co"],
                 ["David", "David4@m.co", "David5@m.co"], ["David", "David2@m.co", "David3@m.co"],
                 ["David", "David1@m.co", "David2@m.co"]]))
