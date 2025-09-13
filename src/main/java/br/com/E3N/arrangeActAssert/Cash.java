package br.com.E3N.arrangeActAssert;

public class Cash {

    /*
    Just demonstrate the pattern Arrange/Act/Assert to test in java
     */

    private int amount;

    public Cash(int amount) {
        this.amount = amount;
    }

    public  void plus(int addend) {
        amount += addend;
    }

    public boolean minus(int subtrahend) {
        if (amount >= subtrahend) {
            amount -= subtrahend;
            return true;
        } else {
            return false;
        }
    }

    public int count() {
        return amount;
    }

}
