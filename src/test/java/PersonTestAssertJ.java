import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PersonTestAssertJ {

    @Test
    public void ShouldContainEmailAdress(){
        Person firstPerson = new Person("Jan", "Kowalski", 33, null);
        firstPerson.generateEmail(firstPerson);
        PersonAssert.personAssert(firstPerson).hasEmailAdress("Jan@Kowalski.com");
    }

}