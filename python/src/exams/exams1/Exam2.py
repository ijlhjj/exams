""" 2-回文数

"""


def is_palindrome(x: int) -> bool:
    text = str(x)
    reverse = text[::-1]
    return text == reverse
