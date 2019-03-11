import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreetingShould {

    @Test
    public void greet_bob(){
        assertThat(Greeting.greet("Bob"), is("Hello, Bob."));
    }

    @Test
    public void greet_hello_friend_when_name_is_null() {
        assertThat(Greeting.greet(null), is("Hello, my friend."));
    }
}