public class LList{
    private Node l=null;
    private Node dummy;
    private int len = 0;

    public void add(String s){
	dummy = new Node("");
	Node temp = new Node(s);
	temp.setNext(l);
	l = temp;
	dummy.setNext(temp);
	len++;
    }

    public String toString(){
	String s = "";
	Node temp;
	for (temp=dummy ; temp!=null ; temp=temp.getNext()){
	    s = s + temp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node get(int n){
	Node temp = dummy;
	for(int i = 0;i < n; i ++){
	    temp = temp.getNext();
	}
	return temp;	
    }

    public void remove(int n){
	Node front = get(n-1);
	Node back = get(n+1);
	front.setNext(back);
    }

    public void add(int n, String s){
	Node a = new Node(s);
	Node before = dummy;
	for(int i = 0; i < n;i ++){
	    before = before.getNext();
	}
	Node after = dummy;
	for(int i = 0; i < n+1; i ++){
	    after = after.getNext();
	}
	a.setNext(after);
	before.setNext(a);
    }
    
    /*
    public void remove(int n){
	int before = n-1;
	Node temp = l;
	for(int i = 0;i < before; i ++){
	    temp = temp.getNext();
	}
	if (temp.getNext() == null){
	    
	    temp.setNext(temp.getNext().getNext());
	} else {
	    temp.setNext(null);
	}
    }
    */

    
}
