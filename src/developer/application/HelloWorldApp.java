package developer.application;

import developer.data.HelloWorld;
/**
 *anonymus class
 */

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello World");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("World");
    }
}
