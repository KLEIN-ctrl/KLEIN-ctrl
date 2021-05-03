public class Take {
    public static void main(String[] args) {
        try{
            String str="lili";
            System.out.println(str+"年龄是:");
            int age=Integer.parseInt("20l");
            System.out.println(age);
        }catch (Exception e){
          e.printStackTrace();
        }
        System.out.println("program over");
    }

}
//当try语句块中程序发生异常的时候，程序就会转到catch语句里，，将继续执行catch代码块后的代码，而不会执行try代码块中的发生异常的代码。
//结论是Java的异常处理是结构化的，不会因为一个异常影响整个程序的执行。
