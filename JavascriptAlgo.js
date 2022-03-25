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
// console.log(validatePIN("1234"))