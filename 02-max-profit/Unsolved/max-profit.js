// Write a function that takes an array of integers representing the price of a stock on different days. Return the maximum profit that can be made from buying and selling a single stock
// arr = [7, 1, 5, 3, 6, 4]
var maxProfit = function(arr) {
    l = 0;
    r = 1;
    maxP= 0
    for (let i = 0; i < arr.length; i++) {
        if (arr[l]<arr[r]) {
            x = arr[r]-arr[l]
            if (maxP<x) {
                maxP = x
            }else{
                maxP = maxP
            }
        r++
        }else{
            l = r;
            r = r+1
        }
    }
    return maxP
};
