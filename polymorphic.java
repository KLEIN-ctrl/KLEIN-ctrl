//TODO:A为父类，B，C为子类，B.C是A的多态 ”同样的语句，不同的结果“例如下面：
public class A1 {
    static class A{
        public void fun(){
            System.out.println("父类中的fun方法");
        }
        static class B extends A{
            public void fun(){
                System.out.println("B类中的fun方法");
            }
        }
        static class C extends A{
            public void fun(){
                System.out.println("C类中的fun方法");
            }
        }

        public static void main(String[] args) {
            A a=new A();
            A b=new B();
            A c=new C();
            a.fun();
            b.fun();
            c.fun();

        }
    }
}
