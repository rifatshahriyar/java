// Use an enum constructor, instance variable, and method.
enum AppleNew {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price; // price of each apple
    // Constructor
    AppleNew(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String args[]) {
        AppleNew ap;
        // Display price of Winesap.
        System.out.println("Winesap costs " +
                AppleNew.Winesap.getPrice() +
                " cents.\n");
        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(AppleNew a : AppleNew.values())
            System.out.println(a + " costs " + a.getPrice() +
                    " cents.");
    } }