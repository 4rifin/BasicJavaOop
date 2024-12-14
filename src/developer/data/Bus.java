package developer.data;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("Bus driving");
    }

    @Override
    public int getSpeed() {
        return 8;
    }

    @Override
    public String getBrandName() {
        return "Hino";
    }
}
