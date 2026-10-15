public class BankAccount {
    private  String accNumber;
    private double Balance;
    private String accHolder;

    BankAccount(String accHolder, String accNumber, double Balance){
        this.accHolder = accHolder;
        this.accNumber = accNumber;
        this.Balance = Balance;
    }

    void deposit(double depAmount){
        if (depAmount > 0 ){
            Balance = Balance + depAmount;
        }else {
            System.out.println("Invalid Amount");
        }

    }
    void withdraw(double withAmount){
        if (withAmount > 0){
            if (Balance > withAmount){
                Balance = Balance - withAmount;
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Invalid Transaction");
        }


    }
    void getBalance(){
        withdraw(100);
        deposit(2000);
    }
    void display(){
        System.out.println("Account Holder: " + accHolder + " Account Number: " + accNumber + " Balance " + Balance );
    }

}
