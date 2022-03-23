# Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. 
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
