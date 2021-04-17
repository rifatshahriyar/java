import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MyClass {
    private String name;

    MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ArrayListDemo3 {

    public static void main(String args[]) {
        // create an array list
        List<MyClass> al = new ArrayList<>();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add(new MyClass("C"));
        al.add(new MyClass("A"));
        al.add(new MyClass("E"));
        al.add(new MyClass("B"));
        al.add(new MyClass("D"));
        al.add(new MyClass("F"));
        al.add(1, new MyClass("A2"));

        System.out.println("Size of al after additions: " + al.size());

        // iterate
        for (int i = 0; i < al.size(); i++) {
            MyClass mc = al.get(i);
            System.out.print(mc.getName() + "  ");
        }
        System.out.println("");

        // streams
        List<String> nameList = al.stream().map(MyClass::getName).collect(Collectors.toList());
        nameList.forEach(e -> System.out.print(e  + " "));

        System.out.println();

    }
}