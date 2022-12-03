
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class PersonHamcrestTest {

    @Test
    public void testEmailContainsSpecialCharacter(){
        Person person = new Person("Jan", "Kowalski", 33, null);
        person.generateEmail(person);
        assertThat(person.getEmail(), is(EmailHamcrest.aValidEmailAdress()));
    }
}
