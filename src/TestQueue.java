import myutil.*;

public class TestQueue {
	
	public static void main(String[] args){
		
		/**
		 * Test for Queue
		 */
			MyQueue<Integer> queue = new MyQueue<>();
			MyQueue<String> sQueue = new MyQueue<>();
			MyQueue<Double> dQueue = new MyQueue<>();
				
			queue.enqueue(1);
			queue.getDataFront();
			queue.enqueue(2);
			queue.getDataBack();
			queue.enqueue(3);
			queue.getDataBack();
			queue.enqueue(6);
			queue.getDataBack();
			
			System.out.println(" ");
			System.out.println(queue.size());
			queue.getDataFront();
				
			System.out.println(" ");
							
			getQueue(queue);
				
			System.out.println(queue.size());
			queue.getDataFront();
			System.out.println(" ");
			
			sQueue.enqueue("hej");
			sQueue.getDataFront();
			sQueue.enqueue("då");
			sQueue.getDataBack();
			
			System.out.println(sQueue.size());
			sQueue.getDataFront();
			System.out.println(" ");
			getQueue(sQueue);
			getQueue(sQueue);
			
			System.out.println(sQueue.size());
			sQueue.getDataFront();
			System.out.println(" ");
			
			dQueue.enqueue(3.14);
			dQueue.getDataFront();
			dQueue.enqueue(15.92);
			dQueue.enqueue(89.79);
			dQueue.enqueue(26.43);
			dQueue.getDataBack();
			System.out.println(" ");
			getQueue(dQueue);
			getQueue(dQueue);
			getQueue(dQueue);
			dQueue.getDataFront();
			dQueue.getDataBack();
			System.out.println(dQueue.size());
	}
				
				
				
				
		private static <E> void getQueue(MyQueue<E> testQueue) {
			{ try {
				testQueue.dequeue(); 
				}
			catch (EmptyQueueError e) {
					System.out.println(e);
				}
			}
				

	}
}
