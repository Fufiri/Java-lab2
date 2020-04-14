package myutil;

public class MyList<E> {
	
	private int size;
	private Node<E> first;
	private Node<E> last;
	
	public MyList() {
		size = 0;
		first = null;
		last = null;
	}
	
	// Komplettering: Alla fall behövs inte
public void add(E element) {
	Node<E> newNode = new Node<E>(element);
	if (first == null) {
		first = newNode;
		last = newNode;	
		first.nextNode = last;
	} else {
		last.nextNode = newNode;
		last = last.nextNode;	
	}	
	size++;
}
   
//TODO - Komplettering: Vad händer om index är mindre än 0
 public E getElementAt(int i) throws IntArrayOutofBoundsError {
	 
	if (i >= size || i < 0) {
		throw new IntArrayOutofBoundsError("Du kan inte kolla efter något som är utanför arrayen. YA DINGUS!");
	} 
	
	Node<E> current = first;
	 
	for (int a = 0; a < i; a++) {
		current = current.nextNode; 
		}
	return current.data;
	}


public boolean isEmpty() { 
	if (size == 0) {
		return true;
	} else {
		return false;
	}
} 

public int getSize() {
	return size;
}

 

}
