import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreetingShould {

    @Test
    public void greet_bob(){
        assertThat(Greeting.greet("Bob"), is("Hello, Bob."));
    }

    @Test
    public void greet_hello_friend_when_name_is_null() {
        assertThat(Greeting.greet((String) null), is("Hello, my friend."));
    }

    @Test
    public void shout_out_JERRY() {
        assertThat(Greeting.greet("JERRY"), is("HELLO JERRY!"));
    }

    @Test
    public void greet_two_people_for_a_list_of_names() {
        assertThat(Greeting.greet(asList("Jill", "Jane")), is("Hello, Jill and Jane."));
    }

    @Test
    public void greet_more_than_two_people_for_a_list_of_names() {
        assertThat(Greeting.greet(asList("Amy", "Brian", "Charlotte")), is("Hello, Amy, Brian, and Charlotte."));
    }

    @Test
    public void greet_more_than_one_shouted_name_after_normal_names() {
        assertThat(Greeting.greet(asList("Amy", "BRIAN", "Charlotte")), is("Hello, Amy and Charlotte. AND HELLO BRIAN!"));
    }
}