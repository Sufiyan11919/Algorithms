// TODO: Write code to create a function that accepts an array numbers
// Return `true` is no number appears in the array more than once, else return `false`

var isUnique = function(arr) {
    obj = {}
    for (let i = 0; i < arr.length; i++) {
        const key = arr[i];
       if(!obj[key]){
        obj[key] = 1
       }else{
        obj[key]++
        console.log(obj)
        if (obj[key]>1) {
            return false
        }

       }
    } return true
};

