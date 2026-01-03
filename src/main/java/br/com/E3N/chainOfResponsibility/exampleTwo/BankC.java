package br.com.E3N.chainOfResponsibility.exampleTwo;

public class BankC extends BankChain{
    public BankC(IdBanks identifier) {
        super(identifier);
    }

    @Override
    protected void paying() {
        System.out.printf("%s is paying.\n", getIdentifier());
    }
}
