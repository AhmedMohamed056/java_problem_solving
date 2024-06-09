package umlTask;

public class Deposit extends Transaction implements Rollback {
    double amount;

    @Override
    public double execute(Acount acount) {
        return super.execute(acount);
    }

    @Override
    public double cancelTransaction(Acount acount) {
        return 0;
    }

}
