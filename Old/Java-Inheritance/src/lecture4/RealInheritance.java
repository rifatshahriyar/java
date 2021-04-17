package lecture4;

class Box {
    double width, height, depth;

    Box(Box ob) {
        width = ob.width; height = ob.height; depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w; height = h; depth = d;
    }

    Box() {
        width = height = depth = 1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w; height = h; depth = d; weight = m;
    }
}

public class RealInheritance {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        System.out.println(weightBox.weight);
        plainBox = weightBox; // assign BoxWeight reference to Box reference
        System.out.println(plainBox.volume()); // OK, volume() defined in Box
        //System.out.println(plainBox.weight); // Error, weight not defined in Box
    }
}
