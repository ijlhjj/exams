""" 182-赎金信

"""

from collections import Counter


def canConstruct(ransomNote: str, magazine: str) -> bool:
    counter1 = Counter(ransomNote)
    counter2 = Counter(magazine)

    for k, v in counter1.items():
        if v > counter2[k]:
            return False

    return True
