/**
 * Created by Administrator on 2017/10/7 0007.
 */
interface produce{
    int getProduceTime();
}
public class Printer implements Output,produce{
    private String[] printDate = new String[MAX_CACHE_LINE];

    private int dataNum = 0;
    public int getProduceTime() {
        return 45;
    }

    public void out() {
        while (dataNum>0)
        {
            System.out.println("打印机打印"+printDate[0]);
            System.arraycopy(printDate,1,printDate,0,--dataNum);
        }
    }

    public void getDate(String msg) {
        if(dataNum>=MAX_CACHE_LINE)
        {
            System.out.println("输出队列已经满了，无法添加");
        }
        else
        {
            printDate[dataNum++] = msg;
        }

    }
    public static void main(String[] args)
    {
        Output o = new Printer();
        o.getDate("this is one");
        o.getDate("this is two");
        o.out();
        o.getDate("this is three");
        o.getDate("this is four");
        o.out();
        o.getDate("this is five");
        o.getDate("this is six");
        o.getDate("this is seven");
        o.getDate("this is eight");
        o.getDate("this is nine");
        o.getDate("this is ten");
        o.getDate("this is eleven");
        o.getDate("this is 12");
        o.out();
        Printer p = new Printer();
        System.out.println(p.getProduceTime());
        Object obj = p;
    }
}
