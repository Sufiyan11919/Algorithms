// Write a function that takes two strings and returns true if every word found in the second string is present in the first string. You will be checking for both words and their frequency. Assume you'll need to worry about casing, but the strings won't contain any punctuation. Assume neither string will be empty

var concertFlyer = function(magazine, flyer) {
    
    const magazineWords = magazine.split(' ')
    const flyerWords = flyer.split(' ')
    x = []
    for(let i = 0; i < flyerWords.length; i++) {
        for(let j = 0; j < magazineWords.length; j++){
            if (JSON.stringify(magazineWords[j]) == JSON.stringify(flyerWords[i])){
                x.push(flyerWords[i]);
            }
        }
    }
    // console.log(x)
    // console.log(flyerWords)
    //Always compare x with smaller array
    let y = flyerWords
    console.log(y)
    if(magazineWords.length < flyerWords.length){
        y = magazineWords
    }

    console.log(y)
    if (JSON.stringify(y) === JSON.stringify(x)){
        return true
    }
    else{
        return false
    }

}

concertFlyer('my name is sufiyan', 'hellow world my is flyer')

// concertFlyer('so many songs', 'Why are there so many songs about rainbows?')
// concertFlyer('hello world', 'hello world hi')
// concertFlyer('Why are there so many songs about rainbows?', 'so many songs')
// concertFlyer('so many songs', 'Why are there so many songs about rainbows?')
    
//     const magazineObj = {}
//     const flyerObj = {}

//     for (let index = 0; index < magazineWords.length; index++) {
//         const word = magazineWords[index];

//         if(!magazineObj[word]) {
//             magazineObj[word] = 1
//         } else {
//             magazineObj[word]++
//         } 
//     }

//     for (let index = 0; index < flyerWords.length; index++) {
//         const word = flyerWords[index];

//         if(!flyerObj[word]) {
//             flyerObj[word] = 1
//         } else {
//             flyerObj[word]++
//         } 
//     }

//     for(var key in flyerObj) {
//         if(magazineObj[key] !== flyerObj[key]) {
//             return false
//         }
//     }

//     return true;
// };











// Send a message to 01-live-mw



