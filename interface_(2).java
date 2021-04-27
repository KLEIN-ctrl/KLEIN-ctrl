abstract interface hello{
    public static final int x=1;
    public abstract void fun1();
        }
        interface world extends hello{
    int y=2;
    void fun2();
        }
class Y implements world{
    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }
}
public class Text {
    public static void main(String[] args){
        //Y类中拥有的属性x和y，也可以用，hello.x和world.y的形式表示，但不能改变他们的取值
        System.out.println(Y.x+","+Y.y);
        System.out.println(hello.x+","+world.y);
    }
}
