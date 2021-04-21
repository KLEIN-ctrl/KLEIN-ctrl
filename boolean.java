public class Bob {
    public static void main(String[] args) {
        Boolean b1=new Boolean("ok");
        Boolean b2=new Boolean(true);
        System.out.println("b1:"+b1.booleanValue());
        System.out.println("b2"+b2.booleanValue());
        Boolean  b3=new Boolean("知道了,我老哥的话，我看见了，但是不想回");
        System.out.println("b3:"+b3.toString());
        StringBuffer str=new StringBuffer("不是不想回，而是不敢回");
        str.append("真的不敢回，对我哥，还有对你们，都是人生的导师，");
        str.append("不敢对你们不敬");
        System.out.println("所以"+str);
    }
}//别跟我哥说，谢谢
//我落下的，全部补上
/*Boolean提供了以下3个常量。
TRUE:对应基值true的Boolean对象
FALSE:对应基值false的Boolean对象
TYPE:基本类型BOOLEAN的Class对象。
 */
