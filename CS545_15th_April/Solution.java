public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int summation = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = symbols.get(s.charAt(i));
            int nextValue = 0;
            if (i + 1 < s.length()) {
                nextValue = symbols.get(s.charAt(i + 1));
            }
            if (currentValue < nextValue) {
                summation -= currentValue;
            } else {
                summation += currentValue;
            }
        }
        return summation;
    }
}
