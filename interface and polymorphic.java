
interface Flyable{
    public void fly();
}
class Plane implements Flyable{
    @Override
    public void fly(){
        System.out.println("飞机在飞....");
    }

}
class  Swallow implements Flyable{
    @Override
    public void fly(){
        System.out.println("燕子在飞....");
    }
}
class Butterfly implements Flyable{
    @Override
    public void fly(){
        System.out.println("蝴蝶在飞...");
    }
}
public class Text2 {
    public void fly(Flyable f) {
        f.fly();
    }
    public static void main(String[] args) {
        Text2 t=new Text2();
        Flyable flyable=null;
        for (int i=1;i<5;i++){
            int m=(int)(Math.random())*3+1;
            switch (m){
    case 1:flyable=new Plane();break;
    case 2:flyable=new Butterfly();break;
    case 3:flyable=new Swallow();break;
}
      t.fly(flyable);
        }
    }

}

