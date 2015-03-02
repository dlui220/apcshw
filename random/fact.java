public class fact {
    public int factorial(int n){
	if (n == 1){
	    return 1;
	} else {
	    return factorial(n-1) * n;
	}
	
    }

    public int fibonacci(int n){
	if (n <= 1){
	    return n;
	} else {
	    return fibonacci(n-1) + fibonacci(n-2);
	}

    }
    public static void main(String[] args){
	fact n = new fact();
	System.out.println(n.factorial(10));
	System.out.println(n.fibonacci(20));
    }

}
