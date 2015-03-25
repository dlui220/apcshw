public boolean empty(){
    return s == null;
}

public void push (E data){
    Node temp = new Node(data);
    temp.setNext(s);
    s = temp;
}

public E pop() {
    E temp = s.getData();
    s=s.getNext();
    return temp;
}

public E top(){
    if (empty)
	then _________;
    return s.getData();
}
