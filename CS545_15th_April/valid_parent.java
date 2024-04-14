class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketPairs.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastOpenedBracket = stack.pop();
                if (bracketPairs.get(lastOpenedBracket) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}