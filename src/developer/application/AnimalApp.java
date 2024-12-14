package developer.application;

import developer.annotation.Fency;
import developer.data.Animal;
import developer.data.Cat;
@Fency(name = "AnimalApp",tags = {"apps","java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Katty";
        animal.eat();
    }

}
