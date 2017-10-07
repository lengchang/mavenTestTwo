/**
 * Created by Administrator on 2017/10/7 0007.
 */
interface Product
{
    public double getPrice();
    public String getName();
}
public class demoFour {
    public void test(Product p)
    {
        System.out.print(" "+p.getPrice()+" "+p.getName());
    }
    public static void main(String[] args)
    {
        demoFour df = new demoFour();
        df.test(new Product() {
            public double getPrice() {
                return 55.5;
            }

            public String getName() {
                return "显卡1";
            }
        });
    }
}
