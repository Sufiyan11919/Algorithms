// [3, 5, 7, 2, 1, 4, 8, 5, 3, 2, 2, 1, 5, 7, 4, 2, 3, 1, 3, 4, 7, 8, 8, 2]
var mostSongsInPlaylist = function(arr) {
  sum = 0;
  count=0;
  console.log(arr)
  arrS = arr.sort()
  for (let i = 0; i < arr.length; i++) {
     if (sum + arrS[i] < 60) {
      count++
      sum = sum + arr[i]
     }
    }
  return count
// do{
  
//   sum = sum + arr[count]
//   count++
//   console.log(count)
// } while (sum<60)
//   return count
    
}   
