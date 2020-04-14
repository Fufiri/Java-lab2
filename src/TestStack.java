import myutil.*;

public class TestStack {
	
	public static void main(String[] args){
		/**
		 * Test for Stack		
		 */
		MyStack<String> stack = new MyStack<>();
		MyStack<Integer> intStack = new MyStack<>();
		MyStack<Double> dStack = new MyStack<>();
				
			stack.push("Hej");
			stack.push("Då");
			stack.push("Du");
			System.out.println(stack.getData());
			System.out.println(stack.size());
			
			getPop(stack);
			getPop(stack);
			getPop(stack);
			getPop(stack);
				
			System.out.println(stack.getData());
			System.out.println(stack.size());
			System.out.println(" ");
			
			intStack.push(4);
			intStack.push(5);
			intStack.push(8);
			System.out.println(intStack.getData());
			System.out.println(intStack.size());
			getPop(intStack);
			System.out.println(intStack.getData());
			System.out.println(intStack.size());
			System.out.println(" ");
			
			dStack.push(1.2);
			dStack.push(2.3);
			dStack.push(3.4);
			System.out.println(dStack.getData());
			System.out.println(dStack.size());
			getPop(dStack);
			System.out.println(dStack.getData());
			System.out.println(dStack.size());
	}
				
			
			private static <E> void getPop(MyStack<E> testStack) {
				{ try {
					testStack.pop();
				} catch (EmptyStackError e) {
						System.out.println(e);
					}
				}
				
	}
}
