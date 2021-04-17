public class VarArgsTest {
    static void vaTest(int ... v){
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        for(boolean x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.print(msg + " ");
        for(int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    /*static void vaTest(int n, int ... v){
        for(int x: v) {
            System.out.println(x + " ");
        }
    }*/


    public static void main(String[] args) {
        vaTest("Testing", 10, 20);
        vaTest(true, false, false);
        //vaTest(); // ambiguity type 1
        vaTest(1, 2, 3); // ambiguity type 2 with vaTest(int n, int ... v) and vaTest(int ... v)
    }
}
