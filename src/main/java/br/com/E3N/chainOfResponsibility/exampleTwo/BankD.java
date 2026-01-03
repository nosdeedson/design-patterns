package br.com.E3N.chainOfResponsibility.exampleTwo;

public class BankD extends BankChain{
    public BankD(IdBanks identifier) {
        super(identifier);
    }

    @Override
    protected void paying() {
        System.out.printf("%s is paying.\n", getIdentifier());
    }
}
