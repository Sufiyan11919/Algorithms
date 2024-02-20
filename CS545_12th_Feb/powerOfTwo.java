class isPowerOfTwo {
    public static boolean isPowOfTwo(int n) {
        if (n==1) {
            return true;
        }
        if (n ==0) {
            return false;
        }
        boolean smallerAnswer = isPowOfTwo(n/2);
        return n % 2 ==0 && smallerAnswer;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPowOfTwo(n));
    }
}