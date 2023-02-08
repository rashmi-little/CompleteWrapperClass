import javax.swing.text.StyledEditorKit.BoldAction;

class Demo {
    public static void main (String args[]) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.TYPE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        String s = Byte.toString((byte)120);
        System.out.println(s+1);// Here that 120 is converted to string so when we add i it reflect as 1201 not 121 
        /* Boolean b = new Boolean(true);
        System.out.println(b.toString()+ 1);
        String k;
        System.out.println(k = Boolean.toString(false)+1); */
        String j = Boolean.toString(false);
        System.out.println(j+1);//false1
        Boolean bool1 = new Boolean(true);
        System.out.println(bool1.toString());
        Byte bt = new Byte((byte)100);
        System.out.println(bt.toString(bt));
        Byte bb = new Byte((byte) 150);
        System.out.println(bb);
        Byte bb1 = Byte.valueOf((byte) 200);
        System.out.println(bb1);
        Byte bb2 = Byte.valueOf("1010",2);
        System.out.println(bb2);
        Byte bb3 = Byte.decode("0x01");
        System.out.println(bb3);
        byte bb5 = Byte.parseByte("10101",2);
    }
}