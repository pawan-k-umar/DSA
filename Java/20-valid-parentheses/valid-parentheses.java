class Solution {
    public boolean isValid(String s) {
        if(s == null || s == ""){
            return false;
        }
        // for(int i=0;i<s.length()-1;i++){
        //     if(s.charAt(i) == '(' && s.charAt(i+1)==')'){
        //         return true;
        //     }
        // }
        // return false;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}