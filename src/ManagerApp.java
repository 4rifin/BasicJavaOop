public class ManagerApp {
    public static void main(String[] args) {
        //inheritance
        var manager = new Manager("arifin");
        manager.name = "arifin";
        manager.sayHello(manager.name);

        var vicePresident = new VicePresident("arifinn");
        vicePresident.name = "arifinn";
        vicePresident.sayHello(vicePresident.name);

    }
}
