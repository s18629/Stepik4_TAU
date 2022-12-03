
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class EmailHamcrest extends TypeSafeMatcher<String> {

    Person person;

    @Override
    protected boolean matchesSafely(String item) {
        return (item.contains("@"));
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Valid mail");
    }

    public static Matcher aValidEmailAdress(){
        return new EmailHamcrest();
    }
}
