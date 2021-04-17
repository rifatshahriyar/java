package lecture3;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.capacity());
        sb.setLength(20);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        sb.append('w');
        sb.append("orld");
        System.out.println(sb);
        sb.insert(5, ' ');
        System.out.println(sb);
        sb.delete(5, sb.length());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
