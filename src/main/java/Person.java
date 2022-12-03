public class Person {
    private String name;
    private String secondName;
    private Integer age;
    private String email;


    public Person(String name, String secondName, Integer age, String email) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void generateEmail(Person person){
        person.setEmail(person.getName() + "@" + person.getSecondName() + ".com");
    }


}
