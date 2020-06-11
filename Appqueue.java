import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class Appqueue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new  ArrayBlockingQueue<Integer>(3);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		System.out.println("Head of the queue is:" + q1.element());
		try{
			q1.add(40);
		}
		catch(IllegalStateException e){
			System.out.println("Tried to add when queue is full");
		}
		for (Integer value : q1){
			System.out.println("Queue Value :" + value); 
		}
		
		System.out.println("Remove elements from queue" + q1.remove());
		System.out.println("Remove elements from queue" + q1.remove());
		System.out.println("Remove elements from queue" + q1.remove());
		try{
			System.out.println("Remove elements from queue" + q1.remove());
		}catch(NoSuchElementException e){
			System.out.println("Tried to remove element not in queue");
		}
		
		System.out.println();
		Queue<Integer> q2 = new  ArrayBlockingQueue<Integer>(2);
		q2.offer(10);
		q2.offer(20);
		System.out.println("Peak Value" + q2.peek());
		if(q2.offer(30)== false){
			System.out.println("Tried to add more items");
		}
		
		for (Integer value1 : q2){
			System.out.println("Queue Value :" + value1); 
		}
		System.out.println("Remove for queue" + q2.poll());
		System.out.println("Remove for queue" + q2.poll());
		System.out.println("Remove for queue" + q2.poll());
		System.out.println("Remove for queue" + q2.poll());
	}

}
