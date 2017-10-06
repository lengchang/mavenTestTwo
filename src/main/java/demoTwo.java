class Person
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    public void info()
    {

    }

    @Override
    public String toString() {
      return  "11111";
    }
}
public class demoTwo {
    public static void main(String[] args)
    {
        Person p = new Person("tom");
        System.out.println(p);
        int it1 = 65;
        float ft1 = 65.0f;
        System.out.print(it1==ft1);
    }
}
