/*     //使用包装类Integer
public class Summation {//创建类名为Summation

    public static void main(String[] args) {
        String str[]={"89","12","10","18","35"};
        int sum=0;
        for (int i=0;i<=str.length;i++){
            int myInt =Integer.parseInt(str[i]);
            sum=sum+myInt;
        }
        System.out.println("数组的各项之和为："+sum);
    }

}
*/
//fixme:Process finished with exit code 1.出现了异常

public class Summation{//获取数字的进制（比如说是十，十六，八）下列举例十进制
    //toString (十） toBinaryString (二） toHexString(十六） toOctalString (八）
    public static void main(String[] args) {
        String str=Integer.toString(456);
        System.out.println("456的十进制为"+str);
    }
}


public class GetCon {
    public static void main(String[] args) {
        int maxInt =Integer.MAX_VALUE;
        int minInt =Integer.MIN_VALUE;
        int intSize=Integer.SIZE;
        System.out.println("int类型可取的最大值"+maxInt);
        System.out.println("int类可取的最小值"+minInt);
        System.out.println("int类型的二进制位数是"+intSize);

    }
}


