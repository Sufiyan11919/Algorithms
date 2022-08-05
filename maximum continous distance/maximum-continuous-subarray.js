const maxSumArray = function(numbers){
  if(numbers.length === 1) {
    return numbers[0]
  }else{
    max = -Infinity;
   
    
    for(i=0; i<numbers.length;i++){
           y = numbers[i]
          
          
        for(j=i+1; j<numbers.length; j++){
            console.log(`the y before is ${y}`)
             y = y + numbers[j]
            
              console.log(y)

             if(max>y){
                max =  max
             }else{
                max = y
             }
             console.log(y)
        }
    }
    console.log(`max is ${max}`)
  }
  return max
};