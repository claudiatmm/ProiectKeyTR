package TEMAcurs7;

public class SavingsAccount extends Account{

            public SavingsAccount (double balance, int accountNumber, Customer accountOwner){
                this.balance =balance;
                this.accountOwner =accountOwner;

            }



    @Override
    public void withdrawMetod(int sumaRetrasa) throws CustomException {
        if (sumaRetrasa > balance){
            throw new CustomException("Insuficient funds Exception");
        }
        else{
            System.out.println("You are allowed!!! - you  withdraw : " +(balance -sumaRetrasa));
        }
    }



}
