const simplifiedPath = function(path) {  
let stack = [];
let components = path.split('/');
    components.forEach(component => {
      if(component === '..') {
        stack.pop();
      }else if(component !== '' && component !== '.'){
        stack.push(component);
      }
    });
    return '/' + stack.join('/');
};