public class mystack<E> {
    private Node<E> l = null;
    private Node<E> dummy;
    private Node<E> top;

    
    public mystack(){
	top = new Node<E>();
    }

    // You decide how the node(s) are declared

    // make whatever constructor(s) you need

    
    public String toString(){
	String s = top.toString();
	for (Node<E> tmp = top.getPrev(); tmp!=null ; tmp=tmp.getPrev()){
	    s = tmp + " --> " + s;
	}
	return s;
    }

    public void push(E data){
        // add something to the top
	Node<E> tmp = new Node<E>(data);
	tmp.setPrev(top);
	top.setNext(tmp);
	top=tmp;
    }
    
    public E pop(){
        // remove and return the top item from the stack
	Node<E> tmp = new Node<E>();
	tmp = top;
	top = top.getPrev();
	return tmp.getData();	
    }
    /*
    public boolean empty(){

    }

    public E top() {
	
        // return the top item from the stack
    }
    */
}
