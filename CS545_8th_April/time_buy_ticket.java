class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int[] indices = new int[n]; 
        for(int i = 0; i < n; i++){
            indices[i] = i;
        }

        int time = 0;
        int idx = 0; 

        while(idx < n){
            time++; 
            int personIdx = indices[idx];
            tickets[personIdx]--; 
            if(personIdx == k && tickets[personIdx] == 0){
                return time;
            }
            if(tickets[personIdx] > 0) {
                shiftToEnd(indices, idx);
            }else {
                idx++; 
            }
        }
        return time;
    }

    private void shiftToEnd(int[] indices, int idx){
        int temp = indices[idx];
        for(int i = idx; i < indices.length-1; i++){
            indices[i] = indices[i+1];
        }
        indices[indices.length-1] = temp;
    }
}
