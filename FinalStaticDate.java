import  java.util.Random;
import  static java.lang.System.out;
public class FinalStaticData {
    private static Random rand =new Random();
    private final int a1=rand.nextInt(10);
    private static final int a2=rand.nextInt(10);

    public static void main(String[] args) {
        FinalStaticData fsd=new FinalStaticData();
        out.println("重新实例化对象调用a1的值："+fsd.a1);
        out.println("重新实例化对象调用a2的值："+fsd.a2);
        FinalStaticData fsd2=new FinalStaticData();
        out.println("重新实例化对象调用a1:"+fsd2.a1);
        out.println("重新实例化对象调用a2:"+fsd2.a2);

    }
}
