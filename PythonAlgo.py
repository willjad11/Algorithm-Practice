# Your task is to make a function that can take any non-negative integer as an 
# argument and return it with its digits in descending order. 
# Essentially, rearrange the digits to create the highest possible number.
# Input: 42145 Output: 54421

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
