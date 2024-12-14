class Person {
    //field/attribute
    String name;
    String address;
    final String country = "Indonesia";

    //constructor
    Person() {
     super();
    }

    //variable shadowing
    Person(String address){
        address = address;
    }

    //constructor Overloading
    Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }

    //contructor call constructor
    Person(String paramName, String paramAddress, String paramCountry) {
        this(paramName, paramAddress);
    }

    //method
    void sayHello(String name) {
        System.out.println("Hello my name is, " + name + "!");
    }
}
