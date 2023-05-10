function evaluatePN(expression) {
    const stack = [];
    const operators = {
      '+': (a, b) => a + b,
      '-': (a, b) => a - b,
      '*': (a, b) => a * b,
      '/': (a, b) => a / b,
    };
    const tok = expression.split(' ').reverse();
  for(let token of tok) {
      if(operators.hasOwnProperty(token)) {
        const a = stack.pop();
        const b = stack.pop();
        const result = operators[token](a, b);
        stack.push(result);
      }else {
        stack.push(parseFloat(token));
      }
    }
  
    return stack.pop();
  }