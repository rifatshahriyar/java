package lecture8;

import java.util.*;

class TestClass implements Comparable {

    String  name;

    TestClass(String name) {
        this.name=name;
    }

    @Override
    public int compareTo(Object o) {
        TestClass m = (TestClass) o;
        return this.name.compareTo(m.name);
    }
}

class ComparatorDemo {

    public static void printArrayList(ArrayList<TestClass> al) {
        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i).name+"  ");
        }
        System.out.println ();
    }

    public static void printArray(TestClass [] ia) {
        for(int i=0;i<ia.length;i++) {
            System.out.print(ia[i].name+"  ");
        }
        System.out.println ();
    }

    public static void main(String args[]) {
        ArrayList<TestClass> al = new ArrayList<>();

        al.add(new TestClass("C"));
        al.add(new TestClass("A"));
        al.add(new TestClass("E"));
        al.add(new TestClass("B"));
        al.add(new TestClass("D"));
        al.add(new TestClass("F"));

        TestClass ia[]=new TestClass[al.size()];
        al.toArray(ia);

        System.out.println("Collection:");
        printArrayList(al);
        Collections.sort(al);
        printArrayList(al);

        System.out.println("Array:");
        printArray(ia);
        Arrays.sort(ia);
        System.out.println("After Sorting:");
        printArray(ia);
    }
}