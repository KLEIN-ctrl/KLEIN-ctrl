//this的用法与super的用法

public class Text {
     private int age=10;
    public Text(){
        System.out.println("初始的年龄是："+age);
    }
    public int getAge(int age){
        this.age=age;
        return this.age;//this的方法也就是引用成员变量，然后输出他
    }

    public static void main(String[] args) {
        Text t1=new Text();
        System.out.println("现在的年龄是："+t1.getAge(12));
    }

}



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
            name="Shanghai";//赋给name，但是name父类也用了，那么，这就是方法重写中的属性的隐藏
            System.out.println(name);//这个就是子类中的“name”了，不是父类中的，虽然是同一个
            System.out.println(super.name);//调用父类的成员变量，与子类区分，用关键字super
        }

        public static void main(String[] args) {
            City c=new City();
            c.value();
        }
    }
}
//这个和this的用法相同都是调用成员变量
//如果不调用父类方法value（），只调用父类变量name的话，则父类name值嵌套为null





public class Person {
    public Person(){
       System.out.println();
    }
    static class person{
        public  void prt(String s){
            System.out.println();
        }
        person(){
            prt("父类·无参数构造方法："+"A.person");
        }//构造方法（—）
        person(String name){
            prt("父类·含一个参数构造方法："+"A.person"+name);
        }//构造方法（2）
        public  class Chinese extends Person{
            Chinese(){
                super();//调用父类构造方法（1）
                prt("子类·调用父类无参数构造方法"+"A.chinese coder");
            }
            Chinese(String name){
                super();
                prt("子类·调用父类含一个参数的构造方法："+"his name is "+name);

            }
            Chinese(String name,int age){
                this(name);
                prt("子类：调用子类具有相同形参的构造方法："+"his name is "+name);
            }

            public  void main(String[] args) {
                Chinese cn=new Chinese();
                cn=new Chinese("codersai");
                cn=new Chinese("codersai",110);
            }


        }
    }
}
