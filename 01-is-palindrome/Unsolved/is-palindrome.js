// Write code that returns true if `str` is a palindrome, and false if `str` is not a palindrome
// var str = "racecar";
var isPalindrome = function(str) {
    console.log(str.length)
    for (let i = 0; i < str.length/2; i++) {
        if(str[i]!==str[str.length-1-i]){
            return false
        }
    } return true
};
