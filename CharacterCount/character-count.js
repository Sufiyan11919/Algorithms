// Write code to create a function that accepts a string and returns an object containing the number of times each character appears in the string


var characterCount = function(str) {
    var charMap = {};
  for (var i = 0; i < str.length; i++) {
      charMap[str[i]] = charMap[str[i]] ? (charMap[str[i]]+1):1;
  
  }
  return charMap;
  };