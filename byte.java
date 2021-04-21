public class Byt {
    public static void main(String[] args) {
        byte myByte=45;
        Byte b=new Byte(myByte);
        System.out.println("b的值为："+b);
        Byte C=new Byte("12");
        System.out.println("c的值为："+ C);
        System.out.println("C与b比较"+C.compareTo(b));
        //compareTo是比较排列顺序的 C的数字在b前面结果为一个负整数，若相等为0，若在后边则为一个正整数

    }
}
