package developer.application;

public class equalsApp {
    public static void main(String[] args) {
        String firstName = "John";
        firstName = firstName + " " + "Petruci";
        System.out.println(firstName);

        String secondName = "John Petruci";
        System.out.println(secondName);

        System.out.println(firstName == secondName);
        System.out.println(firstName.equals(secondName));


    }
}
