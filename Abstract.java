//TODO:Abstract类

public class Mission {
    abstract static class Shape{
        //子类共有但实现方式不同的行为在父类中定义为抽象方法
        public abstract void draw();
        //子类共有且实现凡是相同的行为在父类中定义为成员方法
        public void erase(){
            System.out.println("擦除图形");
        }
    }
    static class Circle extends Shape{
     //重写父类的抽象方法，实现自身的行为
        @Override
        public void draw() {
            System.out.println("绘制圆");
        }
    }
    static  class Rectangle extends  Shape{
      //重写父类的抽象方法，实现自身的行为
        @Override
        public void draw() {
          System.out.println("绘制矩形");
        }
    }

    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        c1.erase();
        Rectangle r1=new Rectangle();
        r1.draw();
        r1.erase();
        //可以定义抽象类的对象引用
        Shape sh;
        //语法错误，抽象类不能实例化对象
        //sh=new Shape();
        //抽象类对象引用可以指向子类的对象
        sh=c1;
        sh.draw();
        sh.erase();
    }

}






   abstract class Animals{

    abstract  public void eat();
    abstract  public void reproduce();
   }
   abstract  class Bird extends Animals{
    String feather;
    abstract  public void move();
    public void growFeather(String feather){
        this.feather=feather;
        System.out.println("我有"+feather+"羽毛");
    }

       @Override
       public void eat() {
           System.out.println();
       }

       @Override
       public void reproduce() {
           System.out.println("我会下蛋");
       }
   }
   class SeaBird extends Bird{

       @Override
       public void move() {
           System.out.println("海鸥飞翔");
       }

       @Override
       public void eat() {
           super.eat();
           System.out.println("海鸥吃鱼");
       }

       @Override
       public void growFeather(String feather) {
           super.growFeather("白色");
       }

       @Override
       public void reproduce() {
           super.reproduce();
       }

   }
   class Chicken extends Bird{
       @Override
       public void move() {
           System.out.println("小鸡快跑");
       }

       @Override
       public void growFeather(String feather) {
           super.growFeather("黄色");
       }

       @Override
       public void eat() {
           super.eat();
           System.out.println("小鸡吃米");
       }

       @Override
       public void reproduce() {
           super.reproduce();
       }
   }
    public class Demo {
        public static void main(String[] args) {
            Chicken c1=new Chicken();
            c1.eat();
            c1.move();
            c1.reproduce();
            c1.growFeather("黄色");
        }
}




 











