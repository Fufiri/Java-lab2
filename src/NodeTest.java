import myutil.*;

public class NodeTest {

	
	public static void main(String[] args){
	/**
	 * Test for nod.
	 */
	
			Node<Integer> node3 = new Node<>(7);
			Node<Integer> node2 = new Node<>(6);
			Node<Integer> node = new Node<>(5);
			node3.setNextNode(node2);
			node2.setNextNode(node);
			node.setNextNode(node3);
			System.out.println(node.getNodeData());
			System.out.println(node.getNextNode().getNodeData());
		
	}
}
