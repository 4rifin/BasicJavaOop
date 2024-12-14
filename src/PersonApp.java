public class PersonApp {
    public static void main(String[] args) {
        var person = new Person();
        person.name = "John";
        person.address = "Street 18";
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        //call method
        person.sayHello(person.name);

        Person person1 = new Person();
        person1.name = "Jane";
        person1.address = "Street 15";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //call method
        person1.sayHello(person1.name);

        Person person2;
        person2 = new Person();
        person2.name = "jonny";
        person2.address = "Street 19";
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);

        //call method
        person2.sayHello(person2.name);

        var person3 = new Person("Jonnychan","Street 15");
        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
        person3.sayHello(person3.name);

        var person4 = new Person("yanto","Street 99","");
        System.out.println(person4.name);
        System.out.println(person4.address);
        person4.sayHello(person4.name);
    }
}
