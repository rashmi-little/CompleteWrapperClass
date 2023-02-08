public class pairOfMethods {
    public static void main(String args[]) {
        Byte a = new Byte((byte)100);
        Byte b = new Byte((byte)100);
        System.out.println(a==b);
         /* This will return false as the == only checks for the adress of the reference */
        // Byte b = Byte.valueOf("100");
        System.out.println(a.equals(b));
        // As equals check for the content
        Byte c = Byte.valueOf("120");
        Byte d = Byte.valueOf("120");
        System.out.println(c == d);// it will return true as value of knows memeory management
        byte k = 20;
        byte m = 20;
        System.out.println(Byte.hashCode(k));
        System.out.println(Byte.hashCode(k));
        System.out.println(a.hashCode()+" "+b.hashCode()+" "+c.hashCode()+" "+d.hashCode());
        Integer.hashCode(m);


    }
}
