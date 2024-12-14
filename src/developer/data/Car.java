package developer.data;

public interface Car extends HasBrand{
    void drive();

    int getSpeed();

    /**
     * Default Method release since java 8
     * @return
     */
    default boolean isFuel(){
        return false;
    }
}
