package TEMAcurs7;

import curs7A.MyCustomException;

public class Account {


    private int accountNumber;
    double balance;
    Customer accountOwner;




    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountOwner(Customer accountOwner) {
        this.accountOwner = accountOwner;
    }



    // metoda withdraw

    public void withdrawMetod(int sumaRetrasa) throws CustomException {
        if (sumaRetrasa > balance){
            throw new CustomException("Insuficient funds for transaction");
        }
        else {
        System.out.println("You are allowed!!!");
         }
    }





}
