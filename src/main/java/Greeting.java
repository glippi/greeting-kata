import java.util.List;

public class Greeting {
    public static String greet(String name) {
        if (name == null) return "Hello, my friend.";
        if(isUppercaseName(name))
            return "HELLO " + name + "!";
        return "Hello, Bob.";
    }

    public static String greet(List<String> names) {
        return null;
    }

    private static boolean isUppercaseName(String name) {
        return name.toUpperCase().equals(name);
    }
}
