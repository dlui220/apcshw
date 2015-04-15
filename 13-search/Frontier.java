import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();
    private int maxX, maxY;
    private int exitX, exitY;
    /*
    public Frontier(int x, int y) { 
	this.maxX = x;
	this.maxY = y;
	for (int i=0;y<maxY;y++){
	    for (int j=0;x<maxX;x++){
		if (board[j][i] == '$'){
		    exitX = x;
		    exitY = y;
		}
	    }
	}
	
    }
    */
    
    

    public void add(Node n){
	l.add(n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










