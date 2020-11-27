package JvmDemo01;

public class IntegerTest {

    public static void main(String[] args) {

        Integer x = 5;
        int     y = 5;
        System.out.println(x==y);//true

        Integer a = 10;
        Integer b= 10;
        System.out.println(a==b);//true

        Integer c =128;
        Integer d =128;    //-128~127为数值本身，否则New()
        System.out.println(c==d);

    }
}
