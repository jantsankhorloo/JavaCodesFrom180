package lab14;

import java.util.Stack;
import java.util.Scanner;

public class Evaluator {
	public int evaluate(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		String[] line = s.split("[ ]+");
		
		for (int i = 0; i < line.length; i++) {
			try {
				stack.push(Integer.parseInt(line[i]));
			} catch(NumberFormatException e) {
				if (line[i].equals("+")) {
					stack.push(((Integer)stack.pop()) + ((Integer) stack.pop()));
				}
				else if (line[i].equals("*")) {
					stack.push(((Integer)stack.pop()) * ((Integer)stack.pop()));
				}
				else {
					stack.push(((Integer)stack.pop()) - ((Integer)stack.pop()));
				}
			}			
		}
		return (Integer) stack.pop();		
	}
	
	public static void main(String[] args) {
		Evaluator test = new Evaluator();
		System.out.println("Enter expression:");
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		System.out.println("Result:");
		System.out.println(test.evaluate(line));
		in.close();
			
	}
}
