public class Main {

    public static void main(String[] args) {
        //BankAccount bankAccount=new BankAccount(123456789,50000,"abcd","abc@gmail.com","9767179338");
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getAccountNo());
        System.out.println(bankAccount.getCustName());

        BankAccount newAccount=new BankAccount("abcde","acb@gmail.com","9876543212");
        System.out.println(newAccount.getBalance()+bankAccount.getBalance());
        System.out.println(newAccount.getAccountNo());
        System.out.println(newAccount.getCustName());


/*
//        bankAccount.setAccountNo(1234567890);
//        bankAccount.setCustName("himanshu Gadge");
//        bankAccount.setEmail("hima@gmail.com");
//        bankAccount.setPhNo("9767179338");
//      //  bankAccount.setBalance(10000);
*/


   /*     System.out.println("Account Number: "+bankAccount.getAccountNo()+"\n");
        System.out.println("Customer Name: "+bankAccount.getCustName()+"\n");
        System.out.println("Contact Number: "+bankAccount.getPhNo()+"\n");
        System.out.println("Email: "+bankAccount.getEmail()+"\n");
   */     bankAccount.deposit(5000);
        bankAccount.withdraw(6000);
    }
}
