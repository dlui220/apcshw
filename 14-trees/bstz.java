public String traverse(Node t){
    if(t==null){
	return "";
    } else {
	return traverse(t.getLeft()) + t.getData()+", "+ traverse(t.getRight());
    }
