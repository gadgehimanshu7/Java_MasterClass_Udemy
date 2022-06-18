public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNo(1234567890);
        bankAccount.setCustName("himanshu Gadge");
        bankAccount.setEmail("hima@gmail.com");
        bankAccount.setPhNo("9767179338");
        bankAccount.setDeposit(1000);
        bankAccount.setBalance(5000);

        System.out.println("Account Number: "+bankAccount.getAccountNo()+"\n");
        System.out.println("Customer Name: "+bankAccount.getCustName()+"\n");
        System.out.println("Contact Number: "+bankAccount.getPhNo()+"\n");
        System.out.println("Email: "+bankAccount.getEmail()+"\n");
        System.out.println("Deposited amount is : "+bankAccount.getDeposit()+"\n");
        System.out.println("previous Balance is : "+bankAccount.getBalance()+"\n");
        bankAccount.Deposit();
        bankAccount.Withdraw();
    }
}
