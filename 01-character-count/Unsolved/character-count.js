// Write code to create a function that accepts a string and returns an object containing the number of times each character appears in the string

var characterCount = function(str) {
    obj = {}
    for (let i = 0; i < str.length; i++) {
        let key = str[i]
        // console.log(key)
        if(!obj[key]){
            obj[key] = 0
            // console.log(`created the new alphabet${obj}`)
        }
        obj[key]++
        // console.log(obj)
    }
        
    // } console.log(obj)
    return obj
};

// characterCount("hello world!! good morning")

// var characterCount = function(str) {
//     obj = {}
//     for (i in str) {
//         let key = str[i]
//         if(!obj[key]){
//             obj[key] = 0
//         }
//         obj[key]++
//     }
//     return obj
// };


// characterCount("hello world!! good morning")

// var characterCount = function(str) {
//     obj = {}
//     for (i in str) {
//         let key = str[i]
//        obj[key] = (obj[key] || 0) + 1
//     }
//     return obj
// };
