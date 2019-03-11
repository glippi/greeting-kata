public class Greeting {
    public static String greet(String name) {
        if (name == null) return "Hello, my friend.";
        if(name.toUpperCase().equals(name))
            return "HELLO " + name.toUpperCase() + "!";
        return "Hello, Bob.";
    }
}
