import java.util.List;

class Greeting {
    static String greet(String name) {
        if (name == null) return "Hello, my friend.";
        if(isUppercaseName(name))
            return "HELLO " + name + "!";
        return "Hello, Bob.";
    }

    static String greet(List<String> names) {
        StringBuilder greetingMultiple = new StringBuilder();
        if(names.size() == 2)
            return "Hello, " + names.get(0) + " and " + names.get(1) + ".";

        for (String name : names) {
            if (names.indexOf(name) == names.size() - 1) {
                greetingMultiple.append("and " + name + ".");
                break;
            }
            greetingMultiple.append(name + ", ");
        }

        return "Hello, " + greetingMultiple.toString();
    }

    private static boolean isUppercaseName(String name) {
        return name.toUpperCase().equals(name);
    }
}
