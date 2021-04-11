//this的用法与super的用法

public class Text {
     private int age=10;
    public Text(){
        System.out.println("初始的年龄是："+age);
    }
    public int getAge(int age){
        this.age=age;
        return this.age;
    }

    public static void main(String[] args) {
        Text t1=new Text();
        System.out.println("现在的年龄是："+t1.getAge(12));
    }

}
//this的方法也就是引用成员变量，然后输出他



public class Country {
    String name;
    void value()
    {
        name="China";

    }
    static class City extends Country{
        String name;

        @Override
        void value() {
            super.value();//调用父类的方法
            name="Shanghai";
            System.out.println(name);
            System.out.println(super.name);
        }

        public static void main(String[] args) {
            City c=new City();
            c.value();
        }
    }
}
//这个和this的用法相同都是调用成员变量
//如果不调用父类方法value（），只调用父类变量name的话，则父类name值嵌套为null
