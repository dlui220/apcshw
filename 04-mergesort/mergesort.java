import java.util.ArrayList;

public class mergesort{

    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> result = new ArrayList<Integer>();
	while (a.size() > 0 || b.size() > 0){
	    if(b.size()==0){
		result.add(a.remove(0));
	    } else if (a.size() == 0){
	        result.add(b.remove(0));
	    } else if (a.get(0) > b.get(0)){
		result.add(b.remove(0));
	    } else {
		result.add(a.remove(0));
	    }
	}

	return result;
    }

    public static void main(String[] args){
	mergesort m = new mergesort();
	
	ArrayList<Integer> first = new ArrayList<Integer>();
	ArrayList<Integer> second = new ArrayList<Integer>();

	first.add(1);
	first.add(6);
	first.add(8);
	first.add(10);

	second.add(2);
	second.add(3);
	second.add(7);
	second.add(9);

	System.out.println(first);
	System.out.println(second);

	System.out.println(m.merge(first,second));
	
    }
}
