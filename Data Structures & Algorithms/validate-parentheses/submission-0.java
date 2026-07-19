class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of('{', '}', '(', ')', '[', ']');

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                Character mapPopped = map.get(stack.pop());
                if (c != mapPopped) return false;
            }
        }
        return stack.isEmpty();
    }
}
