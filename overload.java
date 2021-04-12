//TODO:重载。overload。方法名相同，参数数量或类型不同。不能只是返回值不同
public class OverLoad {
    public void max(int a,int b){
        System.out.println(a>b?a:b);
    }
    //public int max(int a,int b)
    //{
    // return a>b?a:b
    //}
    public void max(float a,float b){
        System.out.println(a>b?a:b);
    }
    public void max(double a,double b){
        System.out.println(a>b?a:b);
    }
    public void max(short a,short b){
        System.out.println(a>b?a:b);
    }

    public static void main(String[] args) {
        OverLoad overLoad=new OverLoad();
        overLoad.max(3,4);
        overLoad.max(3f,4f);
        overLoad.max(3,4);
        overLoad.max(3.0,4.0);
    }
}
