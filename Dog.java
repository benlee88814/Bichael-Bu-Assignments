
public class Dog implements Animal{
    String name;
    int times;

    public Dog(String name, int times)
    {
        this.name = name;
        this.times = times;
    }

    @Override
    public void speak(int times) {
        for (int i = 0;i < times;i++)
        {
            System.out.println("Bark");
        }
    }

    @Override
    public String toString()
    {
        return String.format("Dog -- Name: " + name + " -- Times: " + times);
    }

    @Override
    public int getTimes() {
        return times;
    }
}
