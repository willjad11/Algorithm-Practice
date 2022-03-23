// Write a function that accepts an array of 10 integers(between 0 and 9), that returns a string of those numbers in the form of a phone number.
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