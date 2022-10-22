// Write a function that takes in a Roman Numeral string and returns its integer form

var romanToInt = function(str) {
    var map = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
      };
    //   MDCCXXXVIII
    let result = 0;
    for (let i = 0; i < str.length; i++) {
        const curr = map[str[i]];
        const next = map[str[i+1]];

        if (curr < next) {
            result= result-curr;
            // result= result+ next-curr;
            // i++
        }else{
            result = result + curr
        }
        
    } return result;

};
