//TODO:接口的特点是，不同的过程，相同的结果。与多态（指的是多种分支，但是，结果也不相同--不同的过程，不同的结果）不一样

interface DrawInterface{
      public void draw();
}
 class Qua implements DrawInterface{

     @Override
     public void draw() {
         System.out.println("绘制四边形");
     }
 }
 class Square implements DrawInterface{
     @Override
     public void draw() {
         System.out.println("绘制正方形");
     }
 }
public class Demo1 {
    public static void main(String[] args) {
        DrawInterface d1=new Qua();
        d1.draw();
        DrawInterface d2=new Square();
        d2.draw();

    }
}
