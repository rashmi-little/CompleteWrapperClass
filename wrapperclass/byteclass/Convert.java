public class Convert {
    public static void main(String args[]) {
        Byte btValue = Byte.valueOf((byte)120);
        String string = btValue.toString();
        System.out.println(string+1);
        byte d = Byte.parseByte(string);
        System.out.println(d+1);
    }
}
