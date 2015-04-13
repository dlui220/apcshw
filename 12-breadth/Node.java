public class Node<E> {

    private E data;
    private Node<E> next;
    private Node<E> prev;
    private Node<E> origin;
    /*
    public Node() {
	data = null;
	next = null;
	prev = null;
    }
    */
    public Node(E s) {
	origin = null;
	data = s;
	next = null;
	prev = null;
    }

    public Node(Node<E> o, E d) {
	origin = o;
	data = d;
	next = null;
	prev = null;
    }

    public void setData(E s) { 
	data = s;
    }

    public E getData() {
	return data;
    }

    public void setNext(Node<E> n) {
	next = n;
    }

    public void setPrev(Node<E> n) {
	prev = n;
    }

    public Node<E> getOrigin(){
	return origin;
    }

    public Node<E> getPrev(){
	return prev;
    }

    public Node<E> getNext() {
	return next;
    }
        
    public String toString() {
	return ""+data;
    }

}
