class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        int[] stuQ = new int[len];
        int[] sandStack = new int[len];
        for(int i = 0; i < len; i++) {
            stuQ[i] = students[i];
            sandStack[len-i-1] = sandwiches[i];
        }
        int served = 0;
        int qHead = 0;
        int stackTop = len-1;
        while(qHead < len && served < len) {
            if(sandStack[stackTop] == stuQ[qHead]) {
                stackTop--;
                qHead++;
                served = 0;
            } else {
                int temp = stuQ[qHead];
                for(int i = qHead; i < len-1; i++) {
                    stuQ[i] = stuQ[i+1];
                }
                stuQ[len-1] = temp;
                served++;
            }
        }
        return len - qHead;
    }
}