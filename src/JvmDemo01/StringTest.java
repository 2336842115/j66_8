package JvmDemo01;



public class StringTest {
    public static void main(String[] args) {
        String a=new  String ("ABC") + new String("DEF");
        String b="ABCDEF";
        System.out.println(a==b);
        String c="ABCDEF";
        System.out.println(c==b);
        String e="ABCDEF";
        System.out.println(e==b);
    }
}
