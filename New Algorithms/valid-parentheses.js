//"()[]{}""
//"({[]})"
//"{)([])}"
function ValidParentheses(str) {
    //instead can split the string with no space making new arrat
    const stack = [];
    for(let i = 0; i < str.length; i++) {
      const char = str[i];
      if(char === "(" || char === "[" || char === "{") {
        // Opening brackets, push to stack
        stack.push(char);
      } else {
      if(stack.length == 0) {
        // Found closing bracket without matching opening bracket
        return false;
      }
      // Popping the top bracket from stack
        const top = stack.pop(); 
   // if the Closing bracket does not match opening bracket
    if((char === ")" && top !== "(") || (char === "]" && top !== "[") || (char === "}" && top !== "{")) {
        return false;
    }
      }
    }
  
    return stack.length === 0; 

}

console.log(ValidParentheses("()[]{}"))
console.log(ValidParentheses("({[]})"))
console.log(ValidParentheses("{)([])}"))