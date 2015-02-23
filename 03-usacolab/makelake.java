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
	    while (sc.hasNext())
		{
		    int num = sc.nextInt();
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
