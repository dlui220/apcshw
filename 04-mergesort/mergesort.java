import java.util.ArrayList;
import java.util.Arrays;

public class mergesort{
    /*
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
    */
    public int[] merge(int[] a, int[] b){
	int[] result = new int[a.length + b.length];
	int ac = 0;
	int bc = 0;
	int rc = 0;
	while (bc<b.length || ac<a.length){
	    if (ac == a.length){
		result[rc] = b[bc];
		rc++;
		bc++;
	    } else if (bc == b.length){
		result[rc] = a[ac];
		rc++;
		ac++;
	    } else if (a[ac] > b[bc]){
		result[rc] = b[bc];
		rc++;
		bc++;
	    } else {
		result[rc] = a[ac];
		rc++;
		ac++;
	    }
	}
	return result;
    }
    

    /*
      public ArrayList<Integer> msort(ArrayList<Integer> L){
	  int m = L.size()/2;
	  if (L.size() > 1){
	      ArrayList<Integer> a = new ArrayList<Integer>(L.subList(0,m));
	      ArrayList<Integer> b = new ArrayList<Integer>(L.subList(m,L.size()));
	      ArrayList a1 = msort(a);
	      ArrayList a2 = msort(b);
	      return merge(a1,a2);
	  } else {
	      return L;
	  }
      }
    */
    public int[] msort(int[] L){
	int m = L.length/2;
	if (L.length > 1){
	    int[] a = Arrays.copyOfRange(L, 0, m);
	    int[] b = Arrays.copyOfRange(L, m, L.length);
	    int[] a1 = msort(a);
	    int[] a2 = msort(b);
	    return merge(a1,a2);
	} else {
	    return L;
	}
    }

			 
	    
	    

    
    public static void main(String[] args){
	mergesort m = new mergesort();
	/*
	ArrayList<Integer> first = new ArrayList<Integer>();
	ArrayList<Integer> second = new ArrayList<Integer>();

	first.add(8);
	first.add(6);
	first.add(1);
	first.add(5);

	second.add(3);
	second.add(7);
	second.add(2);
	second.add(9);

	System.out.println(first);
	System.out.println(second);
	
	ArrayList<Integer> testcase = new ArrayList<Integer>();
	testcase.add(1);
	testcase.add(9);
	testcase.add(2);
	testcase.add(6);
	testcase.add(8);
	testcase.add(7);
	testcase.add(3);
	
	*/
	int[] firstarray = new int[8];
	firstarray[0] = 1;
	firstarray[1] = 6;
	firstarray[2] = 8;
	firstarray[3] = 10;
	firstarray[4] = 2;
	firstarray[5] = 3;
	firstarray[6] = 7;
	firstarray[7] = 9;
	
	System.out.println(Arrays.toString(firstarray));
	//	System.out.println(Arrays.toString(secarray));
	
	System.out.println(Arrays.toString(m.msort(firstarray)));
	//	System.out.println(m.merge(first,second));
	
	//      System.out.println(m.msort(testcase));
    }
}
