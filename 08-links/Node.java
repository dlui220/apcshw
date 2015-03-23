public class Node{
    private String data;
    private Node next;

    public Node(String s){
	data = s;
	next = null;
    }
    public Node(int s){
	data = s;
	next = null;
    }
    public void setData(String s){
	data = s;
    }
    public void setData(int s){
	data=s;
    }
    public int getData(){
	return data;
    }
    public String getData(){
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }
}
