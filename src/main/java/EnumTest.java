/**
 * Created by Administrator on 2017/10/7 0007.
 */
public class EnumTest {
    public void judge(SeasonEnum seasonEnum)
    {
        switch (seasonEnum)
        {
            case SPRING:
                System.out.print("春暖花开，正好踏春");
                break;
            case SUMMER:
                System.out.print("夏日炎炎，适合游泳");
                break;
            case FULL:
                System.out.print("秋高气爽，注意进补");
                break;
            case WINTER:
                System.out.print("冬日飘雪，围炉赏雪");
                break;
        }
    }
    public static void main(String[] args)
    {
        //获取指定枚举类的枚举值
        SeasonEnum se = Enum.valueOf(SeasonEnum.class,"WINTER");
        //为获取的枚举值赋值
        se.color = "red";
        System.out.println(SeasonEnum.WINTER.color);

        //所有的枚举类都有一个自带方法，values,返回该枚举类的所有实例
        for (SeasonEnum s:SeasonEnum.values())
        {
            System.out.println(s);
        }
        //还有一种平实的用法，就是直接通过对应的class的形式使用
        new EnumTest().judge(SeasonEnum.WINTER);
    }
}
