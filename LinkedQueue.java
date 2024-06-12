import java.util.EmptyStackException;

public class LinkedQueue<T> implements QueueInterface<T> {
	private Node firstNode;
	private Node lastNode;
	
	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	}
	
	private class Node
	{
      private T    data; // Entry in stack
      private Node next; // Link to next node

      private Node(T dataPortion)
      {
         this(dataPortion, null);
      }

      private Node(T dataPortion, Node linkPortion)
      {
         data = dataPortion;
         next = linkPortion;	
      } // end constructor

      private T getData()
      {
         return data;
      } // end getData

      private void setData(T newData)
      {
         data = newData;
      } // end setData

      private Node getNextNode()
      {
         return next;
      } // end getNextNode

      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
	} // end Node

	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if(isEmpty()) {
			firstNode = newNode;
		} else {
			lastNode.setNextNode(newNode);
		}
		lastNode = newNode;

	}

	@Override
	public T dequeue() {
		T front = getFront();
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();
		if(firstNode == null) lastNode = null;
		return front;
	}

	@Override
	public T getFront() {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			return firstNode.getData();
		}
	}
	
	@Override
	public T getBack() {
		if(isEmpty()) {
			throw new EmptyStackException();
		} else {
			return lastNode.getData();
		}
	}

	@Override
	public boolean isEmpty() {
		
		return (firstNode == null) && (lastNode == null);
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;

	}

	/**
	 * This Java method splices two queues together.
	 * @author Gradi Kayamba
	 * @version 6/12/24
	 */
	
	/**
	 * Splices two queues together.
	 * This method adds to the end of a queue all items that are in a second queue.
	 * This method also empties the second queue.
	 * @param anotherQueue the queue whose elements are to be moved to the end of the first queue
	 */
	@Override
	public void splice(QueueInterface<T> anotherQueue) {
	    // Loop until anotherQueue is empty
	    while (!anotherQueue.isEmpty()) {
	        // Enqueue the element into this queue
	        this.enqueue(anotherQueue.dequeue());
	    }
	}

}
