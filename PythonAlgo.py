# Your task is to make a function that can take any non-negative integer as an 
# argument and return it with its digits in descending order. 
# Essentially, rearrange the digits to create the highest possible number.
# Input: 42145 Output: 54421

import math


def descending_order(num):
    newArray = [str(x) for x in str(num)]
    for i in range(len(newArray)):
        for x in range(len(newArray)):
            if newArray[i] > newArray[x]:
                temp = newArray[i]
                newArray[i] = newArray[x]
                newArray[x] = temp
    return int(''.join(newArray))
# print(descending_order(2943879238))

# ----------------------------------------------------------------------

# Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
# We want to find a positive integer k, if it exists, such that the sum of the digits of n taken 
# to the successive powers of p is equal to k * n.
# Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
# If it is the case we will return k, if not return -1.

def dig_pow(n, p):
    sum = 0
    for number in str(n):
        sum += int(number) ** p
        p = p + 1
    if sum < n or sum % n != 0:
        return -1
    else:
        return sum / n
# print(dig_pow(89, 1))

# ----------------------------------------------------------------------

# Your goal is to implement a difference function, which subtracts one list from another and returns the result.
# It should remove all values from list a, which are present in list b keeping their order.
# If a value is present in b, all of its occurrences must be removed from the other

def array_diff(a, b):
    for number in b:
        while number in a:
            a.remove(number)
    return a
# print(array_diff([1,2], [1]))


# ----------------------------------------------------------------------

# Create a function that takes a list of non-negative integers and strings and returns a list 
# with the strings filtered out.

def filter_list(l):
    return list(filter(lambda x: type(x) != str, l))
# print(filter_list([1,2,'a','b']))


# ----------------------------------------------------------------------

# In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one 
# side of the DNA(string)you need to return the other complementary side. DNA strand is never empty or there is
# no DNA at all.

def DNA_strand(dna):
    return dna.translate(dna.maketrans("ATGC", "TACG"))

# DNA_strand("AAAA")
