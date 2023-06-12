package string_concepts.mystring1;

import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		String s = "{[()]}";
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch  = s.charAt(i);
			if (ch=='{'||ch=='('||ch=='[') {
				
				st.push(ch);
			}else if (ch=='}' && st.peek()=='{') {
				st.pop();
			}else if (ch==']' && st.peek()=='[') {
				st.pop();
			}else if (ch==')' && st.peek()=='(') {
				st.pop();
			}
		}
		if (st.empty()) {
			System.out.println("String is balanced");
		}else {
			System.out.println("String is not balanced");
		}
	}
}
