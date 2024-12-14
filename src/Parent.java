class Parent {
    String name;
    void doSomething() {
        System.out.println("doSomething parent "+name);
    }
}

class Child extends Parent {
    String name;
    void doSomething() {
        System.out.println("doSomething child " +name);
        System.out.println("doSomething Parent Child " +super.name);
    }
}
