import java.io.PrintStream;
public class NonStaticByteMethod {
        public static void main(String[] args) {
            // this printf works actually same as in c.
          /*   int x = 10;
        System.out.printf("HEllo %d",x); */
        Byte bb1 = Byte.valueOf((byte)100);
        System.out.println(bb1.byteValue());
        System.out.println(bb1.shortValue());
        System.out.println(bb1.intValue());
        System.out.println(bb1.floatValue());
        System.out.println(bb1.longValue());
        System.out.println(bb1.doubleValue());
    }
}
