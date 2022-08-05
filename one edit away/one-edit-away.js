const oneEditAway = function(str1, str2) {
    // TODO: Write function that takes in two strings and returns true if one character away, otherwise false
    // Hello || Hexlo
    
    if(str1===str2 ){
        return false
    }else {
        let count=0
        for (let i = 0; i < str1.length; i++) {        
            for (let j = 0; j < str2.length; j++) {              
                if (str1[i]===str2[j]){
                    count = 0
                    break
                }else{                
                    count++
                    if (count > (i+j+1)){
                        return false
                    }            
                }               
            }  
        } return true
    }
}










