/*
1.
public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
*/

/*
2.
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
*/

public class HelloApp {
    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}