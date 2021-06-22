//TODO:正则表达式：它是一种格式。它与str.matches[]。字符串是否与之相配
//使用正则表达式来判断指定的变量是否是合法的E—mail地址：设计思路：[邮箱名]@[服务器名称].[中间名].[后缀]————可以理解成“合法字符串@合法字符串.字符串（可无）.字符串（最大三个字符）
public class RegularExpression {
    public static void main(String[] args) {
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String a1="@163.com";
        String a2="rich@163.vip.com";
        String a3="963.cn";

        if (a1.matches(regex)){
            System.out.println(a1+"是电子邮箱");
        }
        if(a2 .matches(regex)){
            System.out.println(a2+"是电子邮箱");
        }
        if (a3.matches(regex)){
            System.out.println(a3+"是电子邮箱");
        }

    }


}
