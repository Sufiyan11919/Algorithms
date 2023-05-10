class RecentCalls {
    constructor() {
      this.calls = [];
    }
    ping(t) {
        //pushes to end of array
      this.calls.push(t);
      //outdated call cut off time
      const cutoffTime = t - 3000; 
      //removing outdated called from being of array not end
      for(let i = 0; i < this.calls.length; i++) {
        if(this.calls[i] < cutoffTime) {
          this.calls.splice(0, i + 1); 
          //exit if all the outdates calls are removed 
          break; 
        }
      }
      //all calls are return that are left in the queue
      return this.calls.length; 
    }
};
  
// class RecentCalls {
//     constructor() {
//       this.calls = [];
//     } 
//     ping(t) {
//       this.calls.push(t); 
//       const cutoffTime = t - 3000; 
//       const validCalls = this.calls.filter(call => call >= cutoffTime);
//       this.calls = validCalls; 
//       return this.calls.length;
//     }
//   }