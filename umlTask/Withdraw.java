package umlTask;

import java.util.Scanner;

public class Withdraw extends Transaction implements Rollback {
    double amount;

    @Override
    public double execute(Acount acount) {
            System.out.println("enter amount");
            double amount=new Scanner(System.in).nextDouble();
            if (amount< acount.balance) {
                acount.balance = acount.balance - amount;

        }
        return super.execute(acount);
    }

    @Override
    public double cancelTransaction(Acount acount) {
        return 0;
    }

}
