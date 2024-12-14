public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Arifin";
        child.doSomething();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doSomething();
        System.out.println(parent.name);
    }
}
