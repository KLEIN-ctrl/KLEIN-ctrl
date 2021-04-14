//这是super的用法之一（第三条）super被重构的对象方法
class A {
     String name;
    public String getName(){
       return name;
    }
    public void setName(String name){
        this.name=name;
    }

     public static void main(String[] args) {
         A a=new A();
         a.setName("你好，傻子");
     }
     static class B extends A{
        String name="不，本来就是";
         @Override
         public String getName() {
             return super.getName();
         }


         @Override
         public void setName(java.lang.String name) {
             super.setName(name);
         }

         public static void main(String[] args) {
             B b=new B();
             System.out.println("是吗？"+ b.name);
         }
     }
}




//这是this.对象变量名
public class Oops {
   String name;
    public Oops(String name1){
        System.out.println("他的名字为"+name1);
    }
    public Oops(){
        this("桐谷和人");

    }

    public static void main(String[] args) {
        Oops b=new Oops();

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
            name="Shanghai";
            System.out.println(name);
            System.out.println(super.name);//调用父类的成员变量
        }

        public static void main(String[] args) {
            City c=new City();
            c.value();
        }
    }

}
//运用了“引用父类中被隐藏地对象变量，形式为：super.成员变量名
/*在子类对父类的继承中，如果子类的成员变量和父类的成员变量同名，此时称为子类隐藏（override）了父类的成员变量。
这种情况下，子类使用的变量是它自己的变量，而不是父类的同名变量。
于是，父类的成员变量不能被子类简单继承，如果子类要调用父类的变量，则必须借助super关键字。还有一种情况是子类的方法名和父类的方法名相同，并且返回值的类型和入口参数的数目。
类型均相同，那么在子类中，从父类继承的方法就会被置换
 */


//这个和this的用法相同都是调用成员变量
//若不调用父类方法value（），只调用父类变量name的话，则父类name值默认null


