package lecture8;

import java.util.*;

class ArrayListDemo1 {
  
  public static void main(String args[]) {
    // create an array list
    ArrayList al = new ArrayList();    
    System.out.println("Initial size of al: " +  al.size());

    // add elements to the array list
    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    al.add(1, "A2");

    System.out.println("Size of al after additions: " +  al.size());

    // display the array list
    System.out.println("Contents of al: " + al);
    
    // iterate
    for(int i=0;i<al.size();i++) {
    	System.out.print(al.get(i)+"  ");
    }
    System.out.println ("");

    System.out.println("Start");
    // print all elements using lambda expression
    al.forEach(e -> System.out.println(e));
    System.out.println("End");


    // Remove elements from the array list
    al.remove("F");
    al.remove(2);

    System.out.println("Size of al after deletions: " + al.size());
    System.out.println("Contents of al: " + al);
  }
}