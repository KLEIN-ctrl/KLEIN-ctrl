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
这上面是super的用法之一（第三条）super被重构的对象方法

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
这是this.对象变量名



