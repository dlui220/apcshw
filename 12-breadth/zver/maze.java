public void bfs(int x, int y){
    Frontier f = new Frontier();
    
    f.add(new Node(x,y));
    
    Node tmp = null;
    int tx=0,ty=0;

    while (!f.isEmpty()){
	Node current = f.remove();
	int cx = current.getX();
	int cy = current.getY();
	
	board[x][y]='z';

	tx = cx + 1;
	ty = cy;
	if (board[tx][ty]=='#' || board[tx][ty]=='$'){
	    tmp = new Node(tx,ty);
	    f.add(tmp);
	}
    }
}
