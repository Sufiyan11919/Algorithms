// Write code to create a function that accepts two strings
// Return true if the second string is a substring of any permutation of the first string
// Else return false
var str = "nAtsuiPlwuan";
var sub = "Austin";
var permutationSubstring = function(str, sub) {
    n = sub.length
    count = 0
    console.log(n)
    for (let i = 0; i < str.length; i++) {
        const x = str[i];
        for (let j = 0; j < sub.length; j++) {
            const y = sub[j];
            if (x===y) {
                count ++
                console.log(count)
                if(count===n){
                    return true
                }
                break
            }
        }       
    } 
    return false
};
