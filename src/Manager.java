class Manager extends Employee{

    String address ;

    Manager(String name){
        super(name);
    }

    public Manager() {
        super();
    }

    void sayHello(String name) {
        System.out.println("hi " + name+" my name is "+this.name +" as Manager" ) ;
    }
}
