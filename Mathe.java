import java.lang.Math;
public class Mathe {//方法名，和类名不能一样，所以我改的是Mathe，不然的话，会有错误
    public static void main(String[] args) {
        System.out.println("圆周率的值为："+Math.PI);

        //三角函数
        System.out.println("90°的正弦值是："+Math.sin(Math.PI/2));
        System.out.println("0°的余弦值是："+Math.cos(0));

        //指数函数
        System.out.println("e的平方值是："+Math.exp(2));//exp是指数函数的多少平方，比如exp(2)是e的2次方
        System.out.println("以e为底2的对数函数:"+Math.log(2));
        System.out.println("以10为底2的对数函数:"+Math.log10(2));


        System.out.println("4的平方根是："+Math.sqrt(4));//sqrt是平方根
        System.out.println("8的立方根是："+Math.cbrt(8));//cbrt是立方根

        System.out.println("2是5次方"+Math.pow(2,5));//左边为底数，右边为幂

        //比较运算
        System.out.println("4和8比较谁大"+Math.max(4,8));
        System.out.println("4和8比较谁小"+Math.min(4,8));
        System.out.println("-7的绝对值"+Math.abs(-7));//绝对值

        //四舍五入
        System.out.println("使用Floor方法的结果是："+Math.floor(2.6));
        System.out.println("round方法的结果是："+Math.round(2.4));

        //Math.round(x)=(int)Math.floor(x+0.5f);
        System.out.println("----------------");
        System.out.println(Math.round(15.5));
        System.out.println(Math.round(-15.5));//-15.5+0.5f=-15>=?(与它相近的整数），因此-15
        System.out.println(Math.round(-15.51));//-15.51+0.5f=-15.01>=?(与它相近的整数），因此16

        System.out.println();
     }
}
