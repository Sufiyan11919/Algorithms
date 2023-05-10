const evalRPN = function(tokns) {
    const stack = [];
  
    // Iterate through each token in the array
    for (let tok of tokns) {
      // If the token is an operator
      if (tok === '+') {
        // Pop the top two numbers from the stack
        const num2 = stack.pop();
        const num1 = stack.pop();
        // Perform addition and push the result back onto the stack
        stack.push(num1 + num2);
      } else if (tok === '-') {
        // Pop the top two numbers from the stack
        const num2 = stack.pop();
        const num1 = stack.pop();
        // Perform subtraction and push the result back onto the stack
        stack.push(num1 - num2);
      } else if (tok === '*') {
        // Pop the top two numbers from the stack
        const num2 = stack.pop();
        const num1 = stack.pop();
        // Perform multiplication and push the result back onto the stack
        stack.push(num1 * num2);
      } else if (tok === '/') {
        // Pop the top two numbers from the stack
        const num2 = stack.pop();
        const num1 = stack.pop();
        // Perform integer division and push the result back onto the stack
        stack.push(Math.trunc(num1 / num2));
      } else {
        // If the token is a number, convert it to a numeric value and push it onto the stack
        stack.push(Number(tok));
      }
    }
  
    // The final result will be the single remaining value in the stack
    return stack.pop();
  };
  
  
//   console.log(evalRPN(["3", "15", "+", "3", "*"])); 