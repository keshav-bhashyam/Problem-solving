class Solution {
    
    static Map<Character, Character> mappings;
    
    static {
        mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (mappings.containsKey(s.charAt(i))) {
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != mappings.get(s.charAt(i))) return false;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}