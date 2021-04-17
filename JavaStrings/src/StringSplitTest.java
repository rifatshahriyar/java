public class StringSplitTest {
    public static void main(String[] args) {
        String test = "abc,,def,123";
        String[] out = test.split(",");
        System.out.println(out[0]);
        System.out.println(out[1]);
        System.out.println(out[2]);
        System.out.println(out[3]);

        // String.split() does produce empty tokens, but StringTokenizer doesn't
        /*
        String t = new String("abc,,def,123");
        StringTokenizer tokens = new StringTokenizer(t, ",");
        System.out.println(tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
        */
    }
}
