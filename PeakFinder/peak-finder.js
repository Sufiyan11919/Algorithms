const peakFinder = function(nums) {
  let testIndex = 0, compareIndex = nums.length - 1;
  if (nums.length < 1) {
    return 0;
  }
  if (nums.length === 1) {
    return nums[0];
  }

  while (testIndex < compareIndex) {
    const midIndex = parseInt((testIndex + compareIndex)/2);
      nums[midIndex] > nums[midIndex + 1] ? compareIndex = midIndex : testIndex = midIndex + 1;
  }
  return nums[testIndex];
};
