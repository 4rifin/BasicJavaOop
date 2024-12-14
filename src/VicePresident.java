class VicePresident extends Manager {

    public VicePresident(String name) {
        super(name);
    }

    public VicePresident() {

    }

    //overidingMethod
    void sayHello(String name) {
        System.out.println("hi " + name+" my name is "+this.name +" as VicePresident" ) ;
    }
}
