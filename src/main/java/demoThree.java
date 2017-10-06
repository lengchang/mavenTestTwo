/**
 * Created by Administrator on 2017/10/6 0006.
 */
public class demoThree {
    final int a;
//    final int b;
    final String str;
    final static double d;
//    final static double d2;
//    final char ch;
    {
        str = "hello";
    }
    static
    {
        d = 5.6;
    }
    public demoThree(){
        a = 5;
    }
    public void change()
    {
        //普通方法不能为final变量赋值，只有初始化块，或者是构造器
        //所以以下三个皆错
//        d2 = 5.5;
//        b = 5;
//        ch = 'a';
    }
    public static void main(String[] args)
    {

    }
}
