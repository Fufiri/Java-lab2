package myutil;

public class Node<E> {
	
	protected E data;
	protected Node<E> nextNode;
	
	public Node(E data) {
		this.data = data;
		this.nextNode = null;
	}

	
	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}

	public E getNodeData() {
			return data;
	}

	public Node<E> getNextNode() {
		if (nextNode == null) {
			return null;
		} else {
		return nextNode;
		}
	}
}
