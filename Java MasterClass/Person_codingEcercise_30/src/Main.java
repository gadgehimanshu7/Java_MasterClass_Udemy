public class Main {

    public static void main(String[] args) {

        Person person= new Person();
        person.setFirstName("Himanshu");
        person.setLastName("Gadge");
        person.setAge(22);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

        person.setFirstName(" ");
        person.setLastName("Gadge");
        person.setAge(18);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

        person.setFirstName("Himanshu");
        person.setLastName(" ");
        person.setAge(110);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

        person.setFirstName(" ");
        person.setLastName(" ");
        person.setAge(22);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }
}
