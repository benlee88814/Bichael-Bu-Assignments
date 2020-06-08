
public class Cat implements Animal{
    String name;
    int times;

    public Cat(String name, int times)
    {
        this.name = name;
        this.times = times;
    }

    @Override
    public void speak(int times) {
        for (int i = 0;i < times;i++)
        {
            System.out.println("Meow");
        }
    }


    @Override
    public String toString()
    {
        return String.format("Cat -- Name: " + name + " -- Times: " + times);
    }

    @Override
    public int getTimes()
    {
        return times;
    }
}
