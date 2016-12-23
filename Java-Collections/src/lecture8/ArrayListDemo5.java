package lecture8;

import java.util.*;

class ArrayListDemo5 {
  
  public static void main(String args[]) {
    // create an array list
    ArrayList<Integer> al = new ArrayList<Integer>();    
    System.out.println("Initial size of al: " +  al.size());

    // add elements to the array list
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    
    // foreach iterate
    for(Integer i : al) {
    	System.out.println (i);
    }
    
    // iterate through Iterator
    Iterator<Integer> itr=al.iterator();
    while(itr.hasNext()) {
    	System.out.println (itr.next());
    }
    
    // convert to array
    Integer ia[]=new Integer[al.size()];
    ia=al.toArray(ia);        
    
    // iterate array
    for(int i=0;i<ia.length;i++) {
    	System.out.print(ia[i]+"  ");
    }
    System.out.println ("");
  }
}