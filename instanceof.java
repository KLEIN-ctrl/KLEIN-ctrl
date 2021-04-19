class D{
    String name;
    void value(){
        name="你好啊";
    }
}
class d extends D{
    @Override
    void value() {
        super.value();
        name="你也好啊";
        System.out.println(name);
        System.out.println(super.name);
    }
}
class E extends d{
    @Override
    void value() {
        super.value();
        name="我可不好啊";
        System.out.println(super.name);
    }
}

public class A1 {
    public static void main(String[] args) {
        E e=new E();
        System.out.println("E是d的子类吗？"+(e instanceof d));

        System.out.println("E是D的子类吗？"+(e instanceof D));
        D d1=new D();
        System.out.println("D是d的子类吗？"+(d1 instanceof d));
    }
}
//自己开结果，我无语了，fixme

