/**
 * Created by Administrator on 2017/10/7 0007.
 */
public class demoSix
{
    public demoSix(Season season)
    {
        System.out.print(season.getName()+"   "+season.getDesc());
    }
    public static void main(String[] args)
    {
        new demoSix(Season.FALL);
    }
}
