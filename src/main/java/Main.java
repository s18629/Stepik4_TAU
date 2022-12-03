public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Jan", "Kowalski", 33, null);

        firstPerson.generateEmail(firstPerson);
        System.out.println(firstPerson.getEmail());

    }
}
