import java.io.*;
import java.util.*;

public class knightstour
{
    private int[][] board;
    private int maxX;
    private int maxY;

    private int count = 1;
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    public knightstour(){
	this(9);
    }
    public knightstour(int n){
	maxX=n;
	maxY=n;
	board = new int[maxX][maxY];
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++){
		if ((x < 2 || x >(maxX - 3))||(y < 2 || y > (maxY - 3))){
		    board[x][y] = -1;
		} else {
		    board[x][y] = 0;
		}
	    }
	}
    }
		

    public String toString(){
	String s = "\n";
	    for (int x = 0; x < maxX;x++){
		for (int y = 0; y < maxY;y++){
		    s += String.format("%3d", board[x][y]);
		}
		s += "\n";
	    }
	return s;
    }

    /*
      solved - instance variable to indicate we're done
			
    */
    public void solve(int x, int y){
	if (board[x][y] != 0 || solved){
	    return;
	}

	if (count == (maxX-2)*(maxY-2)){
	    System.out.println(this);
	    solved = true;
	}

	delay(500);
	System.out.println(this);
	if (!solved){
	    board[x][y] = count;
	    count = count + 1;
	}

	solve(x + 2, y + 1);
	solve(x + 2, y - 1);
	solve(x - 2, y + 1);
	solve(x - 2, y - 1);
	solve(x + 1, y + 2);
	solve(x + 1, y - 2);
	solve(x - 1, y + 2);
	solve(x - 1, y - 2);


    }
		
    public static void main(String[] args){
	knightstour k = new knightstour(11);
	k.solve(2,2);
	System.out.println(k);
	
		
    }
}

