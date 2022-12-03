import org.assertj.core.api.AbstractAssert;

public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }


    public PersonAssert hasEmailAdress(String email) {
        isNotNull();
        if (!actual.getEmail().equals(email)) {
            failWithMessage("Expected person to have email %s but was %s",
                    email, actual.getEmail());
        }
        return this;
    }

    public static PersonAssert personAssert(Person actual) {
        return new PersonAssert(actual);
    }
}
