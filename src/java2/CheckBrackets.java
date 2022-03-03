package java2;

import java.util.Stack;

public class CheckBrackets {

	public static void main(String[] args) {
		String inputStr = "{ ( [ ( ] ) }";
		String[] tokens = inputStr.split(" ");
		
		Stack<String> stack = new Stack<>();
		
		for (String str : tokens) {
			System.out.println(str);
			if(str.equals("{") || str.equals("[") || str.equals("(")) {
				stack.push(str);
			}
			else if(str.equals("}")) {
				if(stack.peek().equals("{")) {
					stack.pop();
				}
				else {
					System.out.println(str + "���� �߻�:" + stack.peek());
					break;
				}
			}else if(str.equals("]")) {
					if(stack.peek().equals("[")) {
						stack.pop();
				} else {
					System.out.println(str + "���� �߻� :" + stack.peek());
					break;
				}
			}else if(str.equals(")")) {
				if(stack.peek().equals("(")) {
					stack.pop();
			} else {
				System.out.println(str + "���� �߻� :" + stack.peek());
				break;
		}
	} else {
		System.out.println("üũ �ʿ�!!");
	}
		}
		if(stack.isEmpty()) {
			System.out.println("����");
		}else {
			System.out.println("���� ���� ����");
		}
	}
}
