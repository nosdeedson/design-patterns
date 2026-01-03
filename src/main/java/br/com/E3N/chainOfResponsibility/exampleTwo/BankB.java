package br.com.E3N.chainOfResponsibility.exampleTwo;

public class BankB extends BankChain{
    public BankB(IdBanks identifier) {
        super(identifier);
    }

    @Override
    protected void paying() {
        System.out.printf("%s is paying.\n", getIdentifier());
    }
}
