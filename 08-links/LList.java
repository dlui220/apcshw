public class LList{
    private Node l=null;
    private Node dummy;
    private int len = 0;

    public void add(int s){
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

    public int get(int n){
	Node temp = dummy;
	for(int i = 0;i < n; i ++){
	    temp = temp.getNext();
	}
	return temp.getData();	
    }
    /*
    public void remove(int n){
	Node front = dummy;
	for (int i=0;i<n-1;i++){
	    front=front.getNext();
	}
	Node back = dummy;
	for (int x = 0; x<n+1;x++){
	    back=back.getNext();
	}
	front.setNext(back);
    }
    */
    public int remove(int i){
	Node temp = dummy;
    	int result = 0;
	for (int i = 0; i< this.len;i++){
	    //look thru linked list and find the element + index
	}

	return result;
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

/*
  public string remove(int n){
     if (n<0 || n>this.len)
        throw (exception);
   Node T = L;
   for (int i=0;i<n;i++){
      T=T.getNext();
   }
   String s = T.getNext().getData();
   T.setNext(T.getNext().getNext());
   return s;
 */
