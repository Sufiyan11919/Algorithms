const decodeString = function(str) {
  const stack = [];
  let currentNum = 0;
  let currentStr = '';
  let i = 0;

  while (i < str.length) {
    const element = str[i];

    if (element === '[') {
      stack.push(currentStr);
      stack.push(currentNum);
      currentStr = '';
      currentNum = 0;
    } else if (element === ']') {
      let num = stack.pop();
      let previousStr = stack.pop();
      currentStr = previousStr + currentStr.repeat(num);
    } else if (isDigit(element)) {
      let num = 0;
      while (isDigit(str[i])) {
        num = num * 10 + parseInt(str[i]);
        i++;
      }
      // Decrement i to account for the extra increment in the loop
      i--; 
      currentNum = num;
    } else {
      currentStr += element;
    }

    // Move to the next elementacter
    i++; 
  }

  return currentStr;
};

const isDigit = function(element) {
  return element >= '0' && element <= '9';
};


// console.log(decodeString("4[3[w][q][1]2[c]]"));