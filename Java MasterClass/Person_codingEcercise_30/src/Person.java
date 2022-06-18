public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if ((age < 0) || (age > 100)) {
            return 0;
        } else
            return age;
    }

    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else
            return false;
    }

    public String getFullName() {
        // System.out.println(firstName+lastName);
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return null;
           // System.out.println(" ");
        } else if (firstName.isEmpty()) {
            return lastName;
           // System.out.println(lastName);
        } else if (lastName.isEmpty()) {
            return firstName;
        //    System.out.println(firstName);
        } else {
            return firstName+lastName;
         //   System.out.println(firstName + lastName);
        }
    }
}