function maxRectArea(h) {
    let maxArea = -Infinity;
    for(let i = 0; i < h.length; i++) {
      let l = i;
      let r = i;
  
      while(l > 0 && h[l - 1] >= h[i]) {
        l--;
      }
      while(h[r + 1] >= h[i] && r < h.length - 1) {
        r++;
      }
      const width = r - l + 1;
      const area = h[i] * width;      
      if(maxArea>area){
        maxArea =  maxArea
     }else{
        maxArea = area
     }
    } 
    return maxArea;
}
  