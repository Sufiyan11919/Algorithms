//using this class for program implementation.

class MinStack {
    constructor() {
        // Stack to store elements
        this.stack = [];
        // Stack to store minimum values
      this.minimumStack = []; 
    }
    push(val) {
        // Push the value to the main stack
      this.stack.push(val); 
      if(val <= this.getMin()||this.minimumStack.length === 0) {
          // If the value is equal or smaller to the current minimum,than it pushes to minimumStack
        this.minimumStack.push(val); 
    }
    }
    pop() {
        // Pop the topmost element from the main stack
      const popped = this.stack.pop(); 
      // If the popped element is the current minimum, pop from minimumStack
      if(popped === this.getMin()) {
        this.minimumStack.pop(); 
      }
      return popped;
    }
    // Return the topmost element of the main stack
    topMost() {
      return this.stack[this.stack.length - 1]; 
    }
  
    getMin() {
        // Return the current minimum value
      return this.minimumStack[this.minimumStack.length - 1]; 
    }
  }
  