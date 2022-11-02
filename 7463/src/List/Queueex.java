package List;


	import java.util.*;

	public class Queueex {
	   public static void main(String[] args) {
			
		Queue<String> queue = new LinkedList<>();
		queue.add("10");
		queue.add("20");
		queue.add("25");
		queue.add("35");
		System.out.println("The queue values are:" + queue);
			
		queue.remove("20");
		System.out.println("The queue values after deleted:" + queue);
		System.out.println("Queue Size: " + queue.size());
		System.out.println("Queue Contains element '10' or not : " + queue.contains("10"));

	   }
	}