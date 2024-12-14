class Employee {
    String name;

    public Employee() {
        super();
    }

    void sayHello(String name) {
        System.out.println("hi " + name+" my name is "+this.name +" as Employee" ) ;
    }

    public Employee(String name){
        this.name = name;

    }
}
