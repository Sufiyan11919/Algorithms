// Write code to create a function that returns the factorial of `num`

var factorial = function(num) {
    fact = 1
    while (num > 1) {
        fact = fact * num;
        num--
    }
    return fact
};
