public class Driver {

    public static void main( String[] args ) {

	myQueue<Integer> Q = new myQueue<Integer>();
	
	System.out.println(Q);
	System.out.println("dequeue: " + Q.dequeue());
	System.out.println(Q);
	System.out.println("empty: " + Q.empty());
	System.out.println(Q);

    }

}
