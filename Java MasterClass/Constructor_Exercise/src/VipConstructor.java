public class VipConstructor {
    private String name;
    private long creditLimit;
    private String emailAddress;

    public VipConstructor(){
        this("abcd",150000,"abc@gmail.com");

        System.out.println("Default constructor called....!!!!");
    }

    public VipConstructor(String name, long creditLimit){
        this(name,creditLimit,"abcdfg@gmail.com");
        System.out.println("constructor 2 called....!!!!");
    }

    public VipConstructor(String name,long creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;

        System.out.println("Parametrized constructor called...!!!");
    }


    public String getName() {
        return name;
    }



    public long getCreditLimit() {
        return creditLimit;
    }



    public String getEmailAddress() {
        return emailAddress;
    }


}

