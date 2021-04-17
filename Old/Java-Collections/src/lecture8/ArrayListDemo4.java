package lecture8;

import java.util.*;

class MyClass2
{
	String  name;

    MyClass2(String name) {
		this.name=name;		
	}
}

class ArrayListDemo4 {
  
  public static void main(String args[]) {
    // create an array list
    ArrayList<MyClass2> al = new ArrayList<MyClass2>();
    System.out.println("Initial size of al: " +  al.size());

    // add elements to the array list
    al.add(new MyClass2("C"));
    al.add(new MyClass2("A"));
    al.add(new MyClass2("E"));
    al.add(new MyClass2("B"));
    al.add(new MyClass2("D"));
    al.add(new MyClass2("F"));
    al.add(1,new MyClass2("A2"));
    
    System.out.println("Size of al after additions: " +  al.size());

    // iterate
    for(int i=0;i<al.size();i++) {
    	System.out.print(al.get(i).name+"  ");
    }
    System.out.println ("");

    System.out.println("Start");
    // print all elements using lambda expression
    al.forEach(e -> System.out.println(e.name));
    System.out.println("End");

    // iterate
    for(int i=0;i<al.size();i++) {
    	MyClass2 mc=al.get(i);
    	System.out.print(mc.name+"  ");
    }
    System.out.println ("");   
  }
}