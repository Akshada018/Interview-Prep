package CollectionsFramework;

import java.util.Stack;

public class ParanthesisCheckerByUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "[()}]";
		if(isBalanced(s)) 
			System.out.println("Paranthesis are balanced!");
		else
			System.out.println("Paranthesis are not balanced!");
		
	}
	
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			if(ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			}
			else if (ch == ']' || ch == '}' || ch == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
//				System.out.println("top : "+top);
				
				if(!matches(top, ch)) {
					return false;
				}
				
			}
			
//			System.out.println("==============");
//			System.out.println(stack);
//			System.out.println("==============");
			
			
		}
		
		return stack.isEmpty();
		
	}
	
	public static boolean matches(char open, char close) {
		return (open == '[' && close == ']' ||
				open == '{' && close == '}' ||
				open == '(' && close == ')' ); 
	}

}
