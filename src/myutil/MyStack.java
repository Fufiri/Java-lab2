package myutil;

public class MyStack<E> {

	private int size;
	private Node<E> top;
	
	public MyStack() {
		size = 0;
		top = null;
	}
	
	public void push(E element) {
		Node<E> newNode = new Node<E>(element);
		if (top == null) {
			top = newNode;
		} else {
			newNode.setNextNode(top);
			top = newNode;
		}
		size++;
		
	}
	
	public Object getData() {
		if (isEmpty()) {
		return null;
		} else {
			return top.getNodeData();
		}
	}
	
	public void pop() throws EmptyStackError {
		
		if (!isEmpty()) {
				top = top.getNextNode();
				size = (size-1);
		} else {
			throw new EmptyStackError("stacken är tom");
		}
				
			}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return size;
	}

}
