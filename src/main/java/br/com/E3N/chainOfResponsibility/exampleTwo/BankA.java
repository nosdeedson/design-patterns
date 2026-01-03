package br.com.E3N.chainOfResponsibility.exampleTwo;

public class BankA extends BankChain{

    public BankA(IdBanks identifier) {
        super(identifier);
    }

    @Override
    protected void paying() {
        System.out.printf("%s is paying.\n", getIdentifier());
    }
}
