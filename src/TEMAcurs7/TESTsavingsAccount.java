package TEMAcurs7;

import java.util.Scanner;

public class TESTsavingsAccount {


    public static void main(String[] args) throws CustomException {


        Customer userUnu = new Customer("Vlad", "cluj","vl@yahoo.com");
        System.out.println("HI "+ userUnu.getName());

        SavingsAccount accountUnu = new SavingsAccount(200,33, userUnu );
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount to widraw : ");

        int amount = scan.nextInt();
        accountUnu.withdrawMetod(amount);

    }
}
