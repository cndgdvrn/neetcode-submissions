class Solution {
        public static boolean isPalindrome(String s) {

                        StringBuilder cleaned = new StringBuilder();
        StringBuilder reversedString = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            boolean isIt = Character.isLetterOrDigit(c);
            if(isIt) cleaned.append(Character.toLowerCase(c));
        }

        for (char c : cleaned.toString().toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()){
            Character c = stack.pop();
            reversedString.append(c);
        }


        return reversedString.compareTo(cleaned) == 0;

    }
}
