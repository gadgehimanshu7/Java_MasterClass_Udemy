public class BankAccount {

    //int totalAmount=0;
    private long accountNo;
    private double balance;
    private String custName;
    private String email;
    private String phNo;

    //calling constructor in constructor.....

    public BankAccount(){
        this(12345678,50000,"Hima","abc@gmail.com","9767179338");   //this line calls the 2nd constructor.
        System.out.println("constructor in constructor called....");
    }

    //Declaring constructor
    public BankAccount(long accountNo,double balance, String custName, String email, String phNo){
        System.out.println("Parametrized Constructor called....");
        this.balance=balance;
        this.accountNo=accountNo;
        this.email=email;
        this.custName=custName;
        this.phNo=phNo;
       // System.out.println("");
    }

    //Another constructor....

    public BankAccount(String custName,String email, String phNo){
        this(987654321,30000,custName,email,phNo);
        System.out.println("third constr called....!!!!");
    }

    public long getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public void deposit(double depositAmount) {

        this.balance += depositAmount;
        System.out.println("amount deposited is" + depositAmount + "\nNew balance is" + balance);
    }
        public void withdraw(double withdraw){

            //  Scanner scanner = new Scanner(System.in);
            //  System.out.println("Enter the amount to withdraw: ");
            //int amount = scanner.nextInt();
            if (balance - withdraw < 0) {
                System.out.println("insufficient balance");
                System.out.println("current balance is = " + balance);

            } else {
                balance = balance - withdraw;
                System.out.println("Remaining balance is = " + balance);
            }
        }
}