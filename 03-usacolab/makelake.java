public class makelake {
    private int R;
    private int C;
    private int[][] lake;
    
    public makelake(){
	R=40;
	C=20;
	lake = new char[R][C];
	
	
	try {
	    Scanner sc = new Scanner(new File("lake.dat"));
	    int j=0;
	    if (sc.hasNext()){
		String[] s = sc.nextLine().split(" ");
		for (int i=0;i<R;i++)
		    {
			board[i][j] = num;
		    }
		j++;
	    }
	}
	catch (Exception e)
	    {
	    }
	
	
    }
}


/*
while (in.hasNextLine()) {
    Scanner lineIn = new Scanner(line);
    //The initial case - this first line is used to determine the size of the array
    if(lineIn.hasNext()) {
        //Create a String array by splitting by spaces
        String[] s = lineIn.nextLine().split(" ");
        //Reinitialize the array to hold all of your subarrays
        matrix = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            //Reinitialize each subarray to hold the numbers
            matrix[i] = new int[i];
            //Finally, parse your data from the String array
            matrix[0][i] = Integer.parseInt(s[i]);
        }
    }
    //Repeat the steps now that all of your arrays have been initialized
    for (int j = 1; j < matrix.length; j++) {
        String[] s = lineIn.nextLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            matrix[j][i] = Integer.parseInt(s[i]);
        }
    }
}
*/
