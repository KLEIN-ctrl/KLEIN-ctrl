public class DecimalFormatSimpleDemo {

    public DecimalFormatSimpleDemo(String y) {
        
    }

    static void format(String y, double x){
        DecimalFormatSimpleDemo df=new DecimalFormatSimpleDemo(y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(df.format(x));
        System.out.println();
    }

    private double format(double x) {
        return x;
    }

    public static void main(String[] args) {
        format("####",123);//#不占格，还得123
        format("000",123);

        format("0000",123);//0占格 所以0123

        format("##,##",12345.678);
        format("0.00\u2030",0.0789);//\u2030指的是千分数
    }
}
