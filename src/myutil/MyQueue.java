package myutil;

public class MyQueue<E> {
	
	private int size;
	private Node<E> front;
	private Node<E> back; 
	
	public MyQueue() {
		size = 0;
		front = null;
		back = null;
			
	}
	
	//TODO  - komplettering ta bort ett av else if / else fallen
	 public void enqueue(E element) {
		Node<E> newNode = new Node<E>(element);
		if (front == null) {
			front = newNode;
			back = newNode;	
			front.nextNode = back;
		} else {
			back.nextNode = newNode;
			back = back.nextNode;	
		}
		size++;
	 }
		
	 
	 public void dequeue() throws EmptyQueueError {
		 
		if (!isEmpty()) { 
			front = front.nextNode;
			size = (size-1);
		} else {
			throw new EmptyQueueError("Queue is empty");
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

	 public void getDataBack() {
		if (isEmpty()) {
			System.out.println("Tom");
		} else {
			System.out.println(back.getNodeData());
			}	
		}
		
	 public void getDataFront() {
		if (isEmpty()) {
			System.out.println("Tom");
		} else {
			System.out.println(front.getNodeData());
		}	
	 }
}
	


