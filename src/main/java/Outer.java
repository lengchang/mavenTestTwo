/**
 * Created by Administrator on 2017/10/7 0007.
 */
public class Outer {
    private int outProp = 9;
    class inner
    {
        private int inProp = 5;
        public void acessOuterProp()
        {
            System.out.println(outProp);
        }
    }
    public void acessInnerProp()
    {
        System.out.print(new inner().inProp);
    }
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.acessInnerProp();
        //使用push
    }
}
