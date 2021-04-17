package lecture2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        while(scn.hasNextLine())
        {
            System.out.println(scn.nextLine());
        }
        /*while(scn.hasNextInt())
        {
            System.out.println(scn.nextInt());
        }*/
    }
}
