public class CompareTo {
    public static void main(String[] args) {
        Byte b = Byte.valueOf("20");
        Byte d = Byte.valueOf("20");
        System.out.println(b.compareTo(d));// check for the contain and return the differece
        System.out.println(Byte.compare((byte)20,(byte)40));
    }
}
