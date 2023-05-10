// TODO: Write code to create a function that accepts an array numbers
// Return `true` is no number appears in the array more than once, else return `false`

var isUnique = function(arr) {
    let uniqueNumbers = {};
    for (let i = 0; i < arr.length; i++) {
      // If the current number is already a property of the uniqueNumbers object, return false
      if (uniqueNumbers[arr[i]]) {
        return false;
      } else {
        // Otherwise, add the current number as a property of the uniqueNumbers object
        uniqueNumbers[arr[i]] = true;
      }
    }
    // If we reach the end of the array without finding any duplicates, return true
    return true;
};

// var isUnique = function(arr) {
//     for (let i = 0; i < arr.length; i++) {
//         const element = arr[i];
//         for (let j = i+1; j < arr.length; j++) {
//             const jElement  = arr[j];
//             console.log("i "+element)
//             console.log("j "+jElement)
//             if(element == jElement){
//                 return false
//             }
//         }
//     } return true
// };
