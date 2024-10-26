""" 18-赎金信

"""

import string


def can_construct(ransom_note: str, magazine: str) -> bool:
    for c in string.ascii_lowercase:
        if ransom_note.count(c) > magazine.count(c):
            return False

    return True
