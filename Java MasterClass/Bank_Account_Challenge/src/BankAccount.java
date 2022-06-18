import java.util.Scanner;

public class BankAccount {

    int totalAmount=0;
    private long accountNo;
    private int balance;
    private String custName;
    private String email;
    private String phNo;
    private int deposit;

    public long getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public String getPhNo() {
        return phNo;
    }

    public int getDeposit() {
        return deposit;
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

    public void setBalance(int balance) {
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

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void Deposit() {

       // Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the amount to deposit: ");
      //  deposit = scanner.nextInt();
        totalAmount=deposit+balance;

        //System.out.println("Deposited amount is = " + deposit);
        System.out.println("Total Balance is = "+totalAmount+"\n");

    }

    public void Withdraw() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount > totalAmount) {
            System.out.println("insufficient balance");
            System.out.println("Remaining balance is = " + totalAmount);

        } else {
            balance = totalAmount - amount;
            System.out.println("Remaining balance is = " + balance);
        }


    }
}