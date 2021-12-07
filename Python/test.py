from typing import Sequence



dx2 = (5-1)/2
dx4 = (5-1)/4
# Interval is [1,5]
# dx2 rectangle bases are [1,3] [3,5]
# dx4 rectangle bases are [1,2] [2,3] [3,4] [4,5]

def f(x):
    return 2/x

#dx2 midpoint height evaluations
# [1,2]
print(f(3/2))
# [2,3]
print(f(5/2))
# [3,4]
print(f(7/2))
# [4,5]
print(f(9/2))
