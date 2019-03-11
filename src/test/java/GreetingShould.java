import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class GreetingShould {
    private Greeting greeting;

    @Test
    public void greet_bob(){
        assertThat(greeting.greet("Bob"), is("Hello, Bob."));
    }

}
