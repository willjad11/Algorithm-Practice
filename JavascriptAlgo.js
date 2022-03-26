// Write a function that accepts an array of 10 integers(between 0 and 9), that returns a string of those
// numbers in the form of a phone number.
// createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) // => returns "(123) 456-7890"

function createPhoneNumber(numbers) {
    let output = "";
    for (let i = 0; i < numbers.length; i++) {
        if (i == 0) {
            output += "(";
        }
        if (i == 3) {
            output += ") ";
        }
        if (i == 6) {
            output += "-";
        }
        output += numbers[i];
    }
    return output;
}
// console.log(createPhoneNumber([1,2,3,4,5,6,7,8,9,0]));

//--------------------------------------------------------------------------------------------

// A pangram is a sentence that contains every single letter of the alphabet at least once.For example, 
// the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters 
// A - Z at least once(case is irrelevant).
// Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

function isPangram(string) {
    let lowerString = string.toLowerCase();
    let letterBank = [];
    for (let i = 0; i < lowerString.length; i++) {
        if (letterBank.indexOf(lowerString[i]) == -1 && lowerString[i].match(/[a-z]/i)) {
            letterBank.push(lowerString[i]);
        }
    }
    if (letterBank.length == 26) {
        return true;
    }
    else {
        return false;
    }
}
// console.log(isPangram("The quick brown fox jumps over the lazy dog"));

//--------------------------------------------------------------------------------------------

// ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything 
// but exactly 4 digits or exactly 6 digits.
// If the function is passed a valid PIN string, return true, else return false.

function validatePIN(pin) {
    if (pin.match(/[^0-9]/) || pin.length != 4 && pin.length != 6) {
        return false
    }
    return true;
}
// console.log(validatePIN("1234"));

//--------------------------------------------------------------------------------------------

// Your task is to construct a building which will be a pile of n cubes.The cube at the bottom will have a volume 
// of n ^ 3, the cube above will have volume of(n - 1) ^ 3 and so on until the top which will have a volume of 1 ^ 3.
// The parameter of the function will be an integer m(total volume of building) and you have to return the integer n 
// such as n ^ 3 + (n - 1) ^ 3 + ... + 1 ^ 3 = m if such a n exists or - 1 if there is no such n.

function findNb(m) {
    let addNum = 1;
    let volume = 0;
    let blocks = 0;
    while (volume < m) {
        volume += addNum ** 3;
        addNum++;
        blocks++;
    }
    if (volume != m) {
        return (-1);
    }
    return blocks;
}
// console.log(findNb(24723578342962));

//--------------------------------------------------------------------------------------------

// Your task is to sort a given string. Each word in the string will contain a single number. This 
// number is the position the word should have in the result. Note: Numbers can be from 1 to 9. 
// So 1 will be the first word(not 0).

function order(words) {
    let sortedArray = [];
    while (sortedArray.length != words.split(" ").length) {
        sortedArray.push(words.split(" ").find(x => x.includes(sortedArray.length + 1)));
    }
    return sortedArray.join(" ");
}
// console.log(order("is2 Thi1s T4est 3a"));

//--------------------------------------------------------------------------------------------

// Complete the findNextSquare method that finds the next integral perfect square after the one 
// passed as a parameter.Recall that an integral perfect square is an integer n such that sqrt(n) 
// is also an integer. If the parameter is itself not a perfect square then - 1 should be returned.
// You may assume the parameter is non - negative.

function findNextSquare(sq) {
    if (Number.isInteger(Math.sqrt(sq))) {
        return ((Math.sqrt(sq) + 1) ** 2)
    }
    return -1;
}
// console.log(findNextSquare(144))

//--------------------------------------------------------------------------------------------

// Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest 
// possible, containing distinct letters - each taken only once - coming from s1 or s2.

function longest(s1, s2) {
    let letterBank = "abcdefghijklmnopqrstuvwxyz";
    let output = "";
    for (let i = 0; i < letterBank.length; i++) {
        if (s1.includes(letterBank[i]) || s2.includes(letterBank[i])) {
            output += letterBank[i];
        }
    }
    return output;
}
// console.log(longest("loopingisfunbutdangerous", "lessdangerousthancoding"))