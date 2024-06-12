package queue;

public class WaitLine {
	
	public static void main(String []args) {
		QueueInterface<String> myQueue = new LinkedQueue<>();
		myQueue.enqueue("Jada");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jazmin");
		myQueue.enqueue("Jorge");
		myQueue.enqueue("Jamal");
		//String front = myQueue.getFront();
		//System.out.println(front + " is at the front of the queue.");
		//front = myQueue.dequeue();
		//System.out.println(front + " is removed from the queue.");
		//myQueue.enqueue("Jerry");
		//front = myQueue.getFront();
		//System.out.println(front + " is at the front of the queue.");
		//front = myQueue.dequeue();
		//System.out.println(front + " is removed from the queue.");
		System.out.println(myQueue.getFront() + " is at the front of the queue.");
		System.out.println(myQueue.getBack() + " is at the back of the queue.");
		System.out.println();
		System.out.println("-- NEW QUEUE --");
		
		QueueInterface<String>  bankLine  = new LinkedQueue<>();
		bankLine.enqueue("John");
		bankLine.enqueue("Matthew");
		//String nextIn = bankLine.dequeue();
		//System.out.println(nextIn + " is removed from the queue.");
		//bankLine.enqueue("Heather");
		//nextIn = bankLine.dequeue();
		//System.out.println(nextIn + " is removed from the queue.");
		//nextIn = bankLine.dequeue();
		//System.out.println(nextIn + " is removed from the queue.");
		//bankLine.enqueue("Nancy");
		//nextIn = bankLine.dequeue();
		//System.out.println(nextIn + " is removed from the queue.");
		//nextIn = bankLine.dequeue();
		//System.out.println(nextIn + " is removed from the queue.");
		System.out.println(bankLine.getFront() + " is at the front of the queue.");
		System.out.println(bankLine.getBack() + " is at the back of the queue.");
		
		System.out.println();
		System.out.println("-- MERGED QUEUE --");
		
		myQueue.splice(bankLine);
		System.out.println(myQueue.getFront() + " is at the front of the queue.");
		System.out.println(myQueue.getBack() + " is at the back of the queue.");


	}

}
