import java.io.*;
import java.util.*;

public class maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='d';
    private char exit='$';
    private char visited = '.';
    private char way = '*';
    private boolean solved = false;
    private myQueue<int[]> frontier;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++){
			board[i][j] = line.charAt(i);
		    }
		j++;
	    }
	}
	catch (Exception e)
	    {
	    }
	frontier = new myQueue<int[]>();
    }
		
    public String toString(){
	String s = "[2J\n";
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++){
		s = s +board[x][y];
	    }
	    s=s+"\n";
	}
	return s;
    }
    
   
    public void solve(){
	while (!solved){
	    Node<int[]> n = frontier.dequeue();
	    int[] coordinates = n.getData();
	    int x = coordinates[0];
	    int y = coordinates[1];
	    	    
	    /*
	    if (board[x][y]==wall ||
		board[x][y]==me ||
		board[x][y]==visited ||
		solved){
		return;
	    }
	    */
	    
	    /*
	    if (board[x][y]==exit){
		System.out.println(this);
		solved = true;
	    }
	    */

	    if (board[x][y] == exit) {
		Node<int[]> X = n;
		while(X!=null){
		    int[] Xcoordinates = X.getData();
		    int Xx = Xcoordinates[0];
		    int Xy = Xcoordinates[1];
		    board[Xx][Xy] = way;
		    X = X.getOrigin();
		}
		solved = true;
	    }

	    if (board[x+1][y]==path || board[x+1][y]==exit){
                if(board[x+1][y]==path){
		    board[x+1][y]=me;
		}
                int[] data = {x+1,y};
                Node<int[]> temp = new Node<int[]>(n,data);
                frontier.enqueue(temp);
            }


            if (board[x-1][y]==path || board[x-1][y]==exit){
                if(board[x-1][y]==path){
		    board[x-1][y]=me;
		}
                int[] data = {x-1,y};
                Node<int[]> temp = new Node<int[]>(n,data);
                frontier.enqueue(temp);
            }


            if (board[x][y+1]==path || board[x][y+1]==exit){
                if(board[x][y+1]==path){
		    board[x][y+1]=me;
		}
                int[] data = {x,y+1};
                Node<int[]> temp = new Node<int[]>(n,data);
                frontier.enqueue(temp);
            }


            if (board[x][y-1]==path || board[x][y-1]==exit){
                if(board[x][y-1]==path){
		    board[x][y-1]=me;
		}
                int[] data = {x,y-1};
                Node<int[]> temp = new Node<int[]>(n,data);
                frontier.enqueue(temp);
            }
            
            delay(50);
            if(board[x][y]!=way) board[x][y]=visited;
            System.out.println(this);
	    
	    /*
	    board[x][y]=me;
	    solve(x+1,y);
	    solve(x-1,y);
	    solve(x,y+1);
	    solve(x,y-1);
	    if (!solved){
		board[x][y]=visited;
	    }
	    */
	}
    }
    public void startsolve(){
        int[] startpt = {1,1};
        board[1][1]=me;
        Node<int[]> n = new Node<int[]>(startpt);
        frontier.enqueue(n);
        solve();
    }

    /*	
    public static void main(String[] args){
	maze m = new maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    */		

}
